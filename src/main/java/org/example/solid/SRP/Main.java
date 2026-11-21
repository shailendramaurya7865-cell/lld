package org.example.solid.SRP;

public class Main {
    public static void main(String[] args) {
        EmployeeSRP employee = new EmployeeSRP();
        EmployeeCalculator calculator = new EmployeeCalculator(employee);
        calculator.calculateInvoice();
        calculator.calculateSalary();
    }
}
