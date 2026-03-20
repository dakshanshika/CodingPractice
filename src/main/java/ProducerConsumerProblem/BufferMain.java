package ProducerConsumerProblem;

import java.util.Queue;

public class BufferMain {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(10);
//        Thread producer = new Thread(()->{
//            for (int i = 0; i < 10; i++) {
//                buffer.produceItem(i);
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        });
//
//        Thread consumer = new Thread(()->{
//            for (int i = 0; i < 10; i++) {
//                buffer.consumeItem();
//                try {
//                    Thread.sleep(300);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        });


        Producer p = new Producer(buffer);
        Consumer c = new Consumer(buffer);
        Thread producer = new Thread(p);
        Thread consumer = new Thread(c);
        producer.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        consumer.start();

    }
}
