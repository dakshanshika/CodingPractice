package Test;

public class TestMain {

    public static void main(String[] args) throws InterruptedException {

//        Thread th = new MultiThreadingTest();
//        System.out.println("1. " + th.getState());
//        th.start();
//        System.out.println("2. " + th.getState());

        Runnable runnableTest = new RunnableTest();
        Thread runnable_Thread = new Thread(runnableTest);
        runnable_Thread.start();

        System.out.println("Runnable Thread name : "+Thread.currentThread().getName());
        runnable_Thread.sleep(500);

        System.out.println("Thread name : "+Thread.currentThread().getName());
        System.out.println("testing testing");

    }
}
