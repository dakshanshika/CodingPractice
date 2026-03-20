package Multithreading;

public class PrintEvenOdd {

    private int num;
    private int i=1;

    public PrintEvenOdd(int num){
        this.num= num;
    }


    public synchronized void printEven(){

        while(i<num){
            try{
                if(i%2 != 0)
                    wait();
            }
            catch (InterruptedException ex){
                new RuntimeException();
            }
            System.out.println("Even :"+ i++);
            notify();
        }
    }

    public synchronized void printOdd(){

        while(i<num){
            try{
                if(i%2 == 0)
                    wait();
            }
            catch (InterruptedException ex){
                new RuntimeException();
            }
            System.out.println("Odd :"+ i++);
            notify();
        }
        }

}
