package CodingProblem;

public class Factorial {

    public static int factorialValue(int n){
        if(n<0) return 0;
        if(n==0 || n==1) return 1;
        return n*factorialValue(n-1);
    }

    public static int factorialBruteForce(int n){
        if(n<0) return 0;
        if(n==0 || n==1) return 1;

        int i = 1;
        int result = 1;
        while(i<=n){
            result *= i;
            i++;
        }
        return result;
    }


    public static void main(String[] args) {
//        System.out.println(factorialValue(6));
        System.out.println(factorialBruteForce(11   ));
    }
}
