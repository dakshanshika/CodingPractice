package Multithreading.counter;

import java.util.stream.IntStream;

public class CounterMain {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1= new Thread(()-> IntStream.range(0,10_000).forEach(i->counter.increment()));
        Thread t2= new Thread(()-> IntStream.range(0,10_000).forEach(i->counter.increment()));
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(counter.getK());

    }
}
