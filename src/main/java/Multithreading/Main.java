package Multithreading;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;

public class Main {


    public static void main(String[] args) {

        PrintEvenOdd printEvenOdd = new PrintEvenOdd(10);

        Thread t1 = new Thread(printEvenOdd::printEven);
        Thread t2 = new Thread(printEvenOdd::printOdd);
        t1.start();
        t2.start();


    }
}
