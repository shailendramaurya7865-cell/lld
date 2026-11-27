package org.example.BuilderPattern.Student;

public class Student {
    int id;
    String name;
    String fatherName;
    String motherName;
    public Student(StudentBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.fatherName = builder.fatherName;
        this.motherName = builder.motherName;
    }



    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                '}';
    }
}
