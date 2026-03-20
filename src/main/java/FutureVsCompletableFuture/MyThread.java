package FutureVsCompletableFuture;

public class MyThread extends Thread{

    public MyThread(String t1) {
        super(t1);
    }

    @Override
    public void run() {
        System.out.println("RUNNING");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread completed");
//        System.out.println(Thread.currentThread().getName() +" " + 10);
    }
}
