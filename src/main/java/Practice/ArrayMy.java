package Practice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayMy {
    //remove occrances
    public void removeOccurnce(int[] arr, int k){

        int[] array = Arrays.stream(arr)
                .filter(i -> i != k)
                .toArray();
        Arrays.stream(array).forEach(System.out::println);
    }
    public boolean isPalindrome(String s) {
        if(s==null || s.trim().isEmpty()) return true;

        String collectedString = Arrays.stream(s.trim().toLowerCase().split(""))
                .filter(c -> c.matches("[a-zA-Z0-9]"))
                .collect(Collectors.joining(""));

        System.out.println(collectedString);
        for(int i=0, j= collectedString.length()-1; i<=j; i++, j--){
            if(collectedString.charAt(i) != collectedString.charAt(j)) return false;
        }
        return true;

    }

    public String reverseStringbyWord(String s){
       String newstring =  Arrays.stream(s.trim().split("\\s+"))
                .collect(Collectors.toList())
                .reversed()
                .stream().collect(Collectors.joining(" "));


        String newstring1 =  Arrays.stream(s.trim().split("\\s+"))
                .reduce((a,b) -> b +" "+a).get();
        System.out.println(newstring1);

        String newstring2 =  Arrays.stream(s.trim().split("\\s+"))
                .collect(Collectors.collectingAndThen
                        (Collectors.toList(), list -> String.join(" ", list.reversed())));
        System.out.println(newstring2);
        return newstring;
    }

    public static void main(String[] args) {
        ArrayMy arrayMy = new ArrayMy();
        String res = arrayMy.reverseStringbyWord("A man, a plan,     a canal:    Panama");
//        System.out.println(res);
    }
}
