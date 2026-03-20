package ProducerConsumerProblem;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Buffer {

    private BlockingQueue<Integer> list = new ArrayBlockingQueue<>(4);

    private int capacity;
    public Buffer(Integer n){
//        this.list=new LinkedList<>();
        this.capacity=n;
    }

//    public synchronized void  produceItem(int item){
//        try{
//            while(list.size()==capacity){
//                wait();
//            }
//            list.add(item);
//            System.out.println("Item added to buffer : "+ item);
//            notify();
//        }
//        catch(InterruptedException ex){
//            Thread.currentThread().interrupt();
//        }
//    }

    public void  produceItem(int item){
        try{
            list.put(item);
            } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Item added to buffer : "+ item);
    }

//    public synchronized void  consumeItem(){
//        try{
//            while(list.isEmpty()){
//                wait();
//            }
//            Integer poll = list.poll();
//            System.out.println("Item consumed from buffer : "+ poll);
//            notify();
//        }
//        catch(InterruptedException ex){
//            Thread.currentThread().interrupt();
//        }
//    }

    public void  consumeItem(){
        try{

            Integer poll = list.take();
            System.out.println("Item consumed from buffer : "+ poll);
        }
        catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }
}
