package DesignPatterns.BuilderDP;

public class Student {
    private int id;
    private String name;
    private String address;
    private String gender;
    private String classname;

    public Student(StudentBuilder studentBuilder) {
        this.id = studentBuilder.id;
        this.name = studentBuilder.name;
        this.address = studentBuilder.address;
        this.gender = studentBuilder.gender;
        this.classname = studentBuilder.classname;
    }

    public static class StudentBuilder{
        private int id;
        private String name;
        private String address;
        private String gender;
        private String classname;

        public StudentBuilder() {}

        public StudentBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public StudentBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public StudentBuilder setClassname(String classname) {
            this.classname = classname;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }
}
