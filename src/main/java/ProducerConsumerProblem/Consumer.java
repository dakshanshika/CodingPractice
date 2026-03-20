package ProducerConsumerProblem;

public class Consumer implements Runnable{

    private Buffer buffer;

    Consumer(Buffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
                buffer.consumeItem();
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
    }
}
