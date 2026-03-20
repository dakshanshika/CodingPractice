package CodingProblem;

public class Palindrome {

    public static void main(String[] args) {
//        System.out.println(isPalinndrome("     "));
//        System.out.println(isPalinndromeStringBuilder("asadddasa"));

        System.out.println(isPalinndromeInteger(123451));
    }

    public static boolean isPalinndromeInteger(int num){
        if(num>=0 && num<10) return true;
        int numAct = num;
        int rev =0;
        while(num >0){
            int rem = num%10;
            rev = rev*10 +rem;
            num /= 10;
        }
        System.out.println(rev);
        return rev==numAct;
    }

    public static boolean isPalinndromeStringBuilder(String s){
        if(s.isBlank()) return false;
        return new StringBuilder(s).reverse().toString().equals(s);
    }
    public static boolean isPalinndrome(String s){
        if(s.isBlank()) return false;
//        if(s.length() ==1) return true;
        int i=0;
        int j=s.length()-1;
        while(i<j){

            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }

        return true;
    }


}
