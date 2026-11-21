package org.example.solid.SRP;

public class EmployeeCalculator {
    private EmployeeSRP employee;

    public EmployeeCalculator(EmployeeSRP employee) {
        this.employee = employee;
    }

    public double calculateSalary() {
        return 100f;
    }

    public double calculateInvoice() {
        return 12f;
    }
}
