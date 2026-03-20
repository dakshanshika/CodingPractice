package Practice;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,2,4,1,5);

        Set<Integer> uniqueList = new HashSet<>(list);

        System.out.println(uniqueList);
    }
}