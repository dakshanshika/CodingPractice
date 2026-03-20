package DesignPatterns.BuilderDP;

public class StudentBuilderMain {

    public static void main(String[] args) {
        Student student = new Student.StudentBuilder()
                .setId(1)
                .setAddress("masani village")
                .setClassname("10th")
                .setGender("female")
                .build();

        System.out.println(student);



    }
}
