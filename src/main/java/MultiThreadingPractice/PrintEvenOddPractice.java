package MultiThreadingPractice;

public class PrintEvenOddPractice {

    private int count = 1;

    public synchronized void printEven(){

        while(count<=10){
            while(count%2 !=0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            if(count<=10) System.out.println("Even Number : " + count++);
            notify();
        }
    }

    public synchronized void printOdd(){

        while(count<=10){
            while(count%2 ==0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            if(count<=10) System.out.println("odd Number : " + count++);
            notify();
        }
    }
}
