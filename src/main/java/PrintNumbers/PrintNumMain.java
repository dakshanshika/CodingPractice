package PrintNumbers;

public class PrintNumMain {

    public static void main(String[] args) {
        PrintNum printNum = new PrintNum();
//        Runnable r1 = ()->{
//            for (int i = 0; i < k; i++) {
//                System.out.println(Thread.currentThread().getName() + " : " + i);
//            }
//        };
//
//        Runnable r2 = ()->{
//            for (int i = 0; i < k; i++) {
//                System.out.println(Thread.currentThread().getName() + " : " + i);
//            }
//        };

        Thread t1 = new Thread(printNum::printEven);
        Thread t2 = new Thread(printNum::printOdd);
        t1.start();
        t2.start();

    }
}
