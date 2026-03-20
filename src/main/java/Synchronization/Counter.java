package Synchronization;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

    private int count=0;

    public void increment(){

//        1000 line of code
        synchronized (this){
            count++;
        }
//        1000 line of code
    }

    public int getCount(){
        return count;
    }





//      using atomic integer for atomic operations
//    private AtomicInteger count= new AtomicInteger();
//
//    public void increment(){
//        count.getAndIncrement();
//    }
//
//    public int getCount(){
//        return count.get();
//    }
}
