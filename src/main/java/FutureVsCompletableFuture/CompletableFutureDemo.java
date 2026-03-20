package FutureVsCompletableFuture;

import java.sql.Time;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class CompletableFutureDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {


        ExecutorService executorService = Executors.newFixedThreadPool(3);
//
//        Callable<Integer> task = () -> {
//            System.out.println("thread name:" + Thread.currentThread().getName());
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            return 5;
//        };
//
//        IntStream.range(0,5).forEach(i-> executorService.submit(task));
//        Future<Integer> submit = executorService.submit(task);

//        System.out.println(submit.get());

//        System.out.println("this is main");
//        executorService.shutdown();

//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> {
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            return 5;
//        }, executorService);
//
//        System.out.println(completableFuture.get());
//
//        completableFuture.thenAccept(System.out::println);
//        completableFuture
//                .thenApplyAsync(result -> result*2,executorService)
//                .thenAcceptAsync(System.out::println, executorService)
//                ;
//        System.out.println("this is main");

//        Thread.sleep(7000);


        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("thread name task 1:" + Thread.currentThread().getName());
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Task 1";
        }, executorService);
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("thread name task 2:" + Thread.currentThread().getName());
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Task 2";
        });

        future1.thenCombine(future2, (result1, result2) -> result1 + " and " + result2)
                .thenAccept(System.out::println);  // Combines results of both tasks



        executorService.shutdown();

        Thread.sleep(3010);
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            if (true) {
                throw new RuntimeException("Calculation failed!");
            }
            return 10;
        }).exceptionally(ex -> {
            System.out.println("Exception: " + ex.getMessage());
            return 0;  // Default value in case of exception
        });
        System.out.println(future.join());  // Output: 0


        CompletableFuture<Integer> future12 = CompletableFuture.supplyAsync(() -> {
            if (true) {
                throw new RuntimeException("Calculation failed!");
            }
            return 10;
        }).handle((res, ex) -> {
            System.out.println("Exception: " + ex.getMessage());
            return 0;  // Default value in case of exception
        });
        System.out.println(future.join());


    }
}
