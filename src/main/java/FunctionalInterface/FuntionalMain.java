package FunctionalInterface;

public class FuntionalMain {

    public static void main(String[] args) {

        int i = 10 * 2;
        Multiplication mf = (a, b)->a*b;

        System.out.println( mf.multiply(10,2));


        Addition ad = (a,b)-> a+b;

        System.out.println(ad.add(10,2));
    }
}
