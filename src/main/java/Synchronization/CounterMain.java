package Synchronization;

public class CounterMain {

    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();
        MyThreadCounter threadCounter1 = new MyThreadCounter(c);
        MyThreadCounter threadCounter2 = new MyThreadCounter(c);

        threadCounter1.start();
        threadCounter2.start();

        Thread.sleep(10);
        System.out.println(c.getCount());
    }
}
