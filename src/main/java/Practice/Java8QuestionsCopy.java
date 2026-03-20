package Practice;

import java.util.*;
import java.util.stream.Collectors;


public class Java8QuestionsCopy {



    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("John", "Smith", "Miami", 8.38, 19, "Civil"),
                new Student("Mike", "Miles", "New York", 8.4, 21, "IT"),
                new Student("Michael", "Peterson", "New York", 7.5, 20, "Civil"),
                new Student("James", "Robertson", "Miami", 9.1, 20, "IT"),
                new Student("John", "Miller", "Miami", 7.83, 20, "Civil")
        );

        //1. Find all students from Miami with a grade > 8.0.

       List<String> students1 = students.stream()
               .filter(s->s.getCity().equalsIgnoreCase("Miami") && s.getGrade()>8.0)
               .map(s-> String.format( "%s %s" , s.getFirstName(), s.getLastName()))
               .collect(Collectors.toList());

        System.out.println("Filtered Students :" + students1);
        //2. Find the students with the highest grade.

        Double highestGrade = students.stream()
                .mapToDouble(Student::getGrade)
                .max()
                .orElseThrow(()-> new RuntimeException("No Student found"));

       List<String> highestGradeStudent= students.stream()
                .filter(s-> s.getGrade()==highestGrade)
                .map(s-> String.format( "%s %s" , s.getFirstName(), s.getLastName()))
                .collect(Collectors.toList());

        System.out.println("HighestGradeStudent : "+ highestGradeStudent);

        //3.Count the number of students in each department.

        Map<String, Long> studentMap=students.stream()
                .collect(Collectors.groupingBy(s->s.getDepartment(), Collectors.counting()));

        System.out.println( studentMap);

        studentMap.forEach((k,v)-> System.out.println(k +":"+ v));

        Map<String, List<Student>> studentMa=students.stream()
                .collect(Collectors.groupingBy(s->s.getDepartment()));
        System.out.println(studentMa);

        Map<String, Set<String>> studentM=students.stream()
                .collect(Collectors.groupingBy(
                        Student::getDepartment,
                        Collectors.mapping(Student::fullName,Collectors.toSet())));
        System.out.println(studentM);

        //4.Find the average grade per department.


        //5. Sort students by age, then by grade.



        //6.Get a comma-separated list of students names.




        //7.Check if all students are above 18.

//        if(aboveEighteen.isEmpty()) System.out.println("No one is above 18");
//        else System.out.println("aboveEighteen : "+aboveEighteen);

        //8.Find the department with the most students.




//        System.out.println("departmentWithMostStudent : " + departmentWithMostStudent.get());

        //9.Partition students into grade > 8.0 and grade <= 8.0.



        //10. Find the students with the longest full name.






        //Given a list of integers,
        // write a program to filter out even numbers and collect the odd numbers into a new list using Java 8 streams.



    }


}

