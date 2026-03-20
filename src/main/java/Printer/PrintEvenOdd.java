package Printer;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintEvenOdd {

    public static void main(String[] args) {
        Thread t1 = new Thread(()-> System.out.println("Thread 1"));
        Thread t2 = new Thread(()-> System.out.println("Thread 2"));

        t1.start();
        t2.start();
        t1.run();
        t2.run();
    }
}
