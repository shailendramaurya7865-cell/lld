package org.example.solid.SRP;

public class EmployeeSRP {

    public String name;
    public double salary;
    public int percentagePFCut;
    public int age;
    public String department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getPercentagePFCut() {
        return percentagePFCut;
    }

    public void setPercentagePFCut(int percentagePFCut) {
        this.percentagePFCut = percentagePFCut;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
