package Multithreading;

public class Printer {

    private int counter;
    private int max;

    public Printer(int max){
        this.max = max;
    }

    public synchronized void printEven(){
        while(counter <= max){
            while(counter%2!=0){
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Even Number : " + counter++);
            notify();
        }
    }

    public synchronized void printOdd(){
        while(counter <= max){
            while(counter%2==0){
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Odd Number : " + counter++);
            notify();
        }
    }

    public static void main(String[] args) {
        Printer printer = new Printer(10);
        Thread th1 = new Thread(printer::printEven);
        Thread th2 = new Thread(printer::printOdd);

        th1.start();
        th2.start();

    }
}
