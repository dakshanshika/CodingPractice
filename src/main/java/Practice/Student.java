package Practice;

public class Student {
    private final String firstName;
    private final String lastName;
    private final String city;
    private final double grade;
    private final int age;
    private final String department;

    // Constructor
    public Student(String firstName, String lastName, String city, double grade, int age, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.grade = grade;
        this.age = age;
        this.department = department;
    }

    public String fullName(){
        return firstName+" "+lastName;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public double getGrade() {
        return grade;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    // toString() for easy printing
    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", grade=" + grade +
                ", age=" + age +
                ", department='" + department + '\'' +
                '}';
    }

}
