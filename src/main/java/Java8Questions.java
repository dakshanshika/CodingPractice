

import Practice.Student;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Java8Questions {



    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("John", "Smith", "Miami", 8.38, 19, "Civil"),
                new Student("Mike", "Miles", "New York", 8.4, 21, "IT"),
                new Student("Michael", "Peterson", "New York", 7.5, 20, "Civil"),
                new Student("James", "Robertson", "Miami", 9.1, 20, "IT"),
                new Student("John", "Miller", "Miami", 7.83, 20, "Civil")
        );

        //1. Find all students from Miami with a grade > 8.0.


        List<Student> list = students
                .stream()
                .filter(x->x.getGrade()>8.0 && x.getCity().equals("Miami"))
                .collect(Collectors.toList());
        System.out.println(list);

        //2. Find the students with the highest grade.
        Optional<Student> highestGradeStu = students
                .stream()
                .sorted((b, a)-> Double.compare(a.getGrade(), b.getGrade()))
                .findFirst();
        System.out.println(highestGradeStu.get());

        //3.Count the number of students in each department.

        Map<String,Long> studentByDepartment =students
                .stream()
                .collect(Collectors.groupingBy(Student::getDepartment,Collectors.counting()));
        System.out.println(studentByDepartment);

        //4.Find the average grade per department.
        Map<String,Double> departmentAvgGrade=students
                .stream()
                .collect(Collectors.groupingBy(Student::getDepartment,Collectors.averagingDouble(Student::getGrade)));
        System.out.println("------------departmentAvgGrade : "+ departmentAvgGrade);

        //5. Sort students by age, then by grade.

        List<Student> sortedStudents= students
                .stream()
                .sorted(Comparator.comparing(Student::getAge).thenComparing(Student::getGrade))
                .collect(Collectors.toList());

       sortedStudents.forEach(System.out::println);

        //6.Get a comma-separated list of students names.

        List<String> studentNames = students
                .stream()
                .map(x->x.getFirstName()+" " + x.getLastName())
                .collect(Collectors.toList());
//        System.out.println("studentNames : "+ studentNames);

        //7.Check if all students are above 18.
       List<Student> aboveEighteen = students
               .stream()
               .filter(x->x.getAge()>18)
               .collect(Collectors.toList());

//        if(aboveEighteen.isEmpty()) System.out.println("No one is above 18");
//        else System.out.println("aboveEighteen : "+aboveEighteen);

        //8.Find the department with the most students.

        Optional<Map.Entry<String,Long>> departmentWithMostStudent = studentByDepartment
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());
//                .map(Map.Entry::getKey);


//        System.out.println("departmentWithMostStudent : " + departmentWithMostStudent.get());

        //9.Partition students into grade > 8.0 and grade <= 8.0.



        //10. Find the students with the longest full name.

        Map<Student,Integer> map = new HashMap<>();
        for(Student s: students){
            map.put(s,(s.getFirstName()+s.getLastName()).length());
        }

       Optional<Student>  obj = map.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
//        System.out.println(obj.get());


//        map.forEach((k,v)-> System.out.println(k + ":" + v));

        //Given a list of integers,
        // write a program to filter out even numbers and collect the odd numbers into a new list using Java 8 streams.



    }


}

