package Multithreading.counter;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

//    private int k=0;
//
//    public synchronized void increment(){
//        k++;
//    }
//
////    public void increment(){
////        synchronized(this) {
////            k++;
////        }
////    }
//
//    public int getK(){
//        return k;
//    }



    private AtomicInteger k= new AtomicInteger(0);

    public void increment(){
        k.getAndIncrement();
    }

    public int getK(){
        return k.get();
    }
}
