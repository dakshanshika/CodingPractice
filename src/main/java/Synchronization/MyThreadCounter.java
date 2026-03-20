package Synchronization;

public class MyThreadCounter extends Thread{

    private Counter counter;

    public MyThreadCounter(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            counter.increment();
        }
    }
}
