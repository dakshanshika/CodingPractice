package ExceptionHandling;


import java.util.Comparator;

public class Student implements Comparable<Student> {

   private String firstname;
   private String lastName;
   private int rollNo;
   private long salary;
    String address;

    public Student(String firstname, String lastName, int rollNo,long salary, String address) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.rollNo = rollNo;
        this.salary = salary;
        this.address = address;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rollNo=" + rollNo +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.lastName.compareTo(o.getLastName());
    }
}
