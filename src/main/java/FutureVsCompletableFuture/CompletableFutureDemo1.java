package FutureVsCompletableFuture;

import java.util.concurrent.*;
import java.util.function.Supplier;

public class CompletableFutureDemo1 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

//        CompletableFuture<Integer> result =CompletableFuture.supplyAsync(()-> 10);
//        System.out.println("Result : "+ result.get());
//        System.out.println("Main");

//        Runnable runnable = ()->{
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println("Hello");
//        };
//
//        Runnable runnable1 = ()-> System.out.println( "division by 0");
//
//
//        ExecutorService exs = Executors.newFixedThreadPool(3);
//
//        exs.submit(runnable1);
//
//        exs.shutdown();

//
//        Long start = System.currentTimeMillis();
//        Supplier<Integer> task1 = () -> {
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println("10");
//            return 10;
//        };
//
//        Supplier<Integer> task2 = () -> {
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println("20");
//            return 20;
//        };
//        ExecutorService myExecutor = Executors.newSingleThreadExecutor();
//        CompletableFuture<Integer> result1 =CompletableFuture.supplyAsync(task1,myExecutor);
//        CompletableFuture<Integer> result2 =CompletableFuture.supplyAsync(task2,myExecutor);
////        System.out.println(result1.join() + result2.join());
//        CompletableFuture<Void> voidCompletableFuture = result1.thenCombine(result2, (a, b) -> a + b)
//                .thenAccept(System.out::println);
//
////        TimeUnit.SECONDS.sleep(1);
//        voidCompletableFuture.join();
//        System.out.println("total time" + (start - System.currentTimeMillis()));
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 10);

        future.thenCompose(result -> CompletableFuture.supplyAsync(() -> result * 2))
                .thenAccept(System.out::println);
//        System.out.println(future.join());  // Output: 20


//        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> 10);
//        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> 20);
//        CompletableFuture<Integer> combined = future1.thenCombine(future2, Integer::sum);
//        System.out.println(combined.join());  // Output: 30

    }
}
