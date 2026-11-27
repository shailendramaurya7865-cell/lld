package org.example.BuilderPattern.Student;

public class Main {
    static void main(String[] args) {
        Student student = new StudentBuilder()
                .setName("Aakash")
                .setFatherName("Praksh")
                .setMotherName("XYZ")
                .setId(1)
                .build();
        System.out.println("student = " + student);;
    }
}
