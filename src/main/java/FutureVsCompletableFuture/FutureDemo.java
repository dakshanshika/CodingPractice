package FutureVsCompletableFuture;

import java.util.concurrent.*;

public class FutureDemo {


    public static void main(String[] args) throws ExecutionException, InterruptedException {


        ExecutorService executor = Executors.newSingleThreadExecutor();
        Callable<Integer> integerCallable = () -> {
            // Simulate a long computation
            Thread.sleep(5000);
            System.out.println("thread name:" + Thread.currentThread().getName());
            return 10;
        };

        Future<Integer> future = executor.submit(integerCallable);

        System.out.println(future.get());  // Blocking until result is available

        executor.shutdown();
        System.out.println(Thread.currentThread().getName());

//        MyThread t = new MyThread("T1");
//        System.out.println(t.getState());
//        t.start();
//        System.out.println(t.getState());
//
//        Thread.sleep(200);
//        System.out.println(t.getState());
//        t.join();
//        System.out.println(t.getState());
//        System.out.println("Main End");

    }
}
