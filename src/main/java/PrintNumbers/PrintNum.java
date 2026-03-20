package PrintNumbers;

import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class PrintNum {
    private int k=10;
    private int i=0;

    public synchronized void printEven() {
        while(i<10){
            while(i%2!=0){
                try {
                    wait(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            i++;
            System.out.println(Thread.currentThread().getName() +" : "+ i);
            notify();
        }
    }

    public synchronized void printOdd() {
        while(i<10){
            while (i%2==0){

                try {
                    wait(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            i++;
            System.out.println(Thread.currentThread().getName() +" : "+ i);
            notify();
        }
    }
}
