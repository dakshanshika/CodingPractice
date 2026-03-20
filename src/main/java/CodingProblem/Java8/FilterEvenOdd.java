package CodingProblem.Java8;

import java.util.Arrays;
import java.util.List;

public class FilterEvenOdd {

    public void filterEvenOdd(List<Integer> numList){
        //1.	Filter even and odd numbers from a list

        List<Integer> evenNumList = numList.stream()
                .filter(number-> number%2==0)
                .toList();

        List<Integer> oddNumList = numList.stream()
                .filter(number-> number%2!=0)
                .toList();

        System.out.println("Even Numbers : "+ evenNumList);
        System.out.println("Odd Numbers : "+ oddNumList);
    }
}
