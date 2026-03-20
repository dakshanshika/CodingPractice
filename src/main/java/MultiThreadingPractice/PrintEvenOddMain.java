package MultiThreadingPractice;

public class PrintEvenOddMain {

    public static void main(String[] args) {

        PrintEvenOddPractice obj = new PrintEvenOddPractice();
        Thread t1 = new Thread(()-> obj.printEven());
        Thread t2 = new Thread(()->obj.printOdd());

        t1.start();
        t2.start();

    }
}
