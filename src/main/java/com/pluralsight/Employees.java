package com.pluralsight;

public class Employees {
    private int employeeId;
    private String name;
    private double hoursWorked;
    private double payRate;


    public Employees(String name, int employeeId, double payRate, double hoursWorked) {
        this.name = name;
        this.employeeId = employeeId;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public Employee(int employeeId, String name, double hoursWorked, double payRate) {

    }


}
