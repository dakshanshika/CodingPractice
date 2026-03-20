package Multithreading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrinterUsingLock {

    private int counter;
    private int max;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public PrinterUsingLock(int max){
        this.max = max;
    }

    public void printEven(){
        lock.lock();

        try{
            while (counter <= max) {
                while (counter % 2 != 0) {
                 condition.await();
                }
                System.out.println("Even Number : " + counter++);
                condition.signal();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    public void printOdd(){
        lock.lock();
        try{
            while (counter <= max) {
                while (counter % 2 == 0) {
                    condition.await();
                }
                System.out.println("Odd Number : " + counter++);
                condition.signal();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        PrinterUsingLock printer = new PrinterUsingLock(10);
        Thread th1 = new Thread(printer::printEven);
        Thread th2 = new Thread(printer::printOdd);

        th1.start();
        th2.start();

    }
}
