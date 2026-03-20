package ExceptionHandling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class ComparatorTest implements Comparator<Student> {
    public List<Student> createStudentData(){

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

        return students;
    }
    @Override
    public int compare(Student s1, Student s2) {
        return (int)(s2.getSalary()-s1.getSalary());
    }

   
}
