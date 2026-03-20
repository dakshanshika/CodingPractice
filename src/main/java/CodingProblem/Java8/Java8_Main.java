package CodingProblem.Java8;

import java.util.*;
import java.util.stream.Collectors;

public class Java8_Main {

    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(1, 2, 3,3,5,8, 4, 5, 6, 7, 8, 9, 10,132,189,1525);
//        //1.	Filter even and odd numbers from a list

//        FilterEvenOdd filterEvenOdd = new FilterEvenOdd();
//        filterEvenOdd.filterEvenOdd(numList);

//        //2.	Find numbers starting with digit 1
//       List<Integer> numbersStartWithOne = numList.stream()
//                .map(String::valueOf)
//                .filter(s-> s.startsWith("1"))
//                .map(Integer::valueOf)
//                .toList();
//
//        System.out.println("numbersStartWithOne : " +numbersStartWithOne);


//        //3.	Remove duplicate elements from a list
//        System.out.println("uniqueNumbers" +new HashSet<>(numList));

        //4. palindrome

        String  str1= "dsgsgbsgd";
        String str2 = "dhgdsfdfvdj";
        String str3 = "sdhgdffvddj";

        boolean result =checkAnagram(str3,str2);
        System.out.println(result);


    }

    private static boolean checkAnagram(String str1, String str2) {
        if(str1.length() != str2.length()) return false;
        char[] str1CharArray = str1.toCharArray();
        Arrays.sort(str1CharArray);

        char[] str2CharArray = str2.toCharArray();
        Arrays.sort(str2CharArray);

        for(int i =0; i<str1.length(); i++){
            if(str1CharArray[i] != str2CharArray[i]) return false;
        }

        return true;
    }

}
