package Multithreading;

import java.util.concurrent.*;

public class DeamonThreadPractice {


    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(()->{
            while(true){
                System.out.println("Thread is ruunning");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t.setDaemon(true);

//        ExecutorService executorService = Executors.newFixedThreadPool(2);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 3,
                                                0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(3));
        int i = 1;
        while(i<100){
        threadPoolExecutor.submit(()->{

                System.out.println( Thread.currentThread().getName()+"Thread is ruunning");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        });
            i++;
        }
        threadPoolExecutor.shutdown();
//        t.start();
//        Thread.sleep(10);


    }
}
