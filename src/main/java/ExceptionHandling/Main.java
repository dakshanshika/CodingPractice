package ExceptionHandling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        StaticExample se = new StaticExample();

        List<Student> students = new ArrayList<>();

        // Adding 10 student data sets to the list
        students.add(new Student("S001", "Alice", 101, 10000l, "1234 Elm St, Springfield"));
        students.add(new Student("S002", "Bob", 102, 5000l, "5678 Oak St, Springfield"));
        students.add(new Student("S003", "Charlie", 103,52000l, "9101 Pine St, Shelbyville"));
        students.add(new Student("S004", "David", 104,15000l, "1122 Maple St, Capital City"));
        students.add(new Student("S005", "Eva", 105, 50000l,"3344 Birch St, Shelbyville"));
        students.add(new Student("S006", "Frank", 106, 89000l,"5566 Cedar St, Capital City"));
        students.add(new Student("S007", "Grace", 107,  50010l,"7788 Walnut St, Springfield"));
        students.add(new Student("S008", "Hannah", 108, 53002l,"9900 Redwood St, Shelbyville"));
        students.add(new Student("S009", "Ivy", 109, 90002l,"2233 Cherry St, Springfield"));
        students.add(new Student("S010", "Jack", 110, 10002l,"4455 Pine St, Capital City"));


        List<String> list = Arrays.asList("sa","cghf","vghvuj","jjj");
//        String max = Collections.max(list);
//        Collections.sort(students, (a,b)-> Math.toIntExact(a.getSalary() - b.getSalary()));
//        students.sort((a,b)-> Math.toIntExact(a.getSalary() - b.getSalary()));
        Collections.sort(students);
        System.out.println(students);
    }
}
