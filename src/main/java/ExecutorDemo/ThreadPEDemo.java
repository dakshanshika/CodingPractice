package ExecutorDemo;

import java.util.concurrent.*;

public class ThreadPEDemo {

    public static void main(String[] args) {


        Runnable task = () -> {
            long  at = System.currentTimeMillis() /1000;
            System.out.println(Thread.currentThread().getName() + " " +at);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
//        executorService.schedule(task,5, TimeUnit.SECONDS);=

        ExecutorService executorService1 = Executors.newFixedThreadPool(5);
        long  at = System.currentTimeMillis() /1000;
        System.out.println(Thread.currentThread().getName() + " " +at);
        executorService.scheduleAtFixedRate(task,2,3,TimeUnit.SECONDS);

//        executorService.scheduleWithFixedDelay(task,2,3,TimeUnit.SECONDS);


        try {
                Thread.sleep(10_0000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        executorService.shutdown();
    }
}
