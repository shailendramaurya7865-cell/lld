package org.example.BuilderPattern.Student;

public class StudentBuilder {
    int id;
    String name;
    String fatherName;
    String motherName;

    public Student build() {
        return new Student(this);
    }


    public StudentBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }
}
