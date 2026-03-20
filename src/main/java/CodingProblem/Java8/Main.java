package CodingProblem.Java8;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        //  1.	Count the occurrence of each character in a String
        String s = "iloveabhishek";
        char[] charArray = s.toLowerCase().toCharArray();

        Stream<String> stream = Arrays.stream(s.toLowerCase().split(""));
//        Map<String, Long> collect = stream
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(collect);

        Map<String, List<String>> collect3 = stream.collect(Collectors.groupingBy(i -> i));
        System.out.println(collect3);

        //2. Count of duplicate element from a given String
        List<String> collect1 = Arrays.stream(s.toLowerCase().split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream().filter(x -> x.getValue() > 1)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());

        System.out.println("duplicate : "+collect1);
        //2. Count of unique element from a given String

        List<String> collect2 = Arrays.stream(s.toLowerCase().split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() == 1)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());

        System.out.println("Unique elements : "+ collect2);

        // 4. find first non repeat element from a given String
        String key = Arrays.stream(s.toLowerCase().split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new
                        , Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() == 1)
                .findFirst().get().getKey();
        System.out.println("first non repeating value : "+ key);


        //5. find the second highest number from given array

        int[] arr = {5,9,11,2,8,21,1};
        List<Integer> i = Arrays.stream(arr).boxed()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        Integer i1 = Arrays.stream(arr).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println("second largest : " + i1);


        //6.find the longest String from the given array

        String[] strArray = {"java","microservicemicroservice","Springboot", "microservice","Springbootmicroservice"};

        String s1 = Arrays.stream(strArray)
                .reduce((w1, w2) -> w2.length() > w1.length() ? w2 : w1)
                .get();
        System.out.println("Longest string : "+ s1);


         // 7. write a program to find all the elements from the array who starts with the 1

        List<Integer> intArr =  Arrays.asList(1,5,15,52,19,21,17);
        List<String> list = intArr.stream()
                .map(n -> n + "")
                .filter(st -> st.startsWith("1"))
                .toList();
        System.out.println("start with 1 :" + list);

        //8. String.join()

        Integer[] numArr = {1,2,3,4,5};
//        String.join();

    }


}
