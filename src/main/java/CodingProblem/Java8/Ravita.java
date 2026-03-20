package CodingProblem.Java8;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ravita {


    public static void main(String[] args) {
        //        List of employees names grouped by department.

        List<List<Employee>> empList = getEmployees();
        System.out.println(empList);
        Map<String, List<String>> collect = empList.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.groupingBy(Employee::department,
                        Collectors.collectingAndThen(
                                Collectors.mapping(Employee::name, Collectors.toList()),
                                list -> list.stream().sorted().toList()
                        )));
        System.out.println(collect);

//        total salary grouped by department.

//        List of employees grouped by gender in asce order of emp names.




    }

    public static List<List<Employee>> getEmployees() {
        return List.of(
                List.of(
                        new Employee(1, "John Doe", "Development", 80000, "Male"),
                        new Employee(2, "Jane Smith", "Development", 80000, "Female"),
                        new Employee(6, "Sophia Brown", "Development", 85000, "Female"),
                        new Employee(8, "Olivia Harris", "Development", 88000, "Female"),
                        new Employee(10, "Emily Clark", "Development", 95000, "Female")),
                List.of(
                        new Employee(9, "William Lee", "Sales", 78000, "Male"),
                        new Employee(3, "Robert Brown", "Sales", 60000, "Male")),
                List.of(
                        new Employee(5, "Michael Green", "Finance", 90000, "Male")),
                List.of(
                        new Employee(4, "Lisa White", "HR", 55000, "Female"),
                        new Employee(7, "James Wilson", "HR", 72000, "Male"))

        );

    }
}
