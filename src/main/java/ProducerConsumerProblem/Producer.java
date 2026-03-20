package ProducerConsumerProblem;

public class Producer implements Runnable{

    private Buffer buffer;

    Producer(Buffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
                buffer.produceItem(i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
    }
}
