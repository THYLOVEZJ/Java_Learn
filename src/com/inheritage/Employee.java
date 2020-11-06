package com.inheritage;

import java.time.LocalDate;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireday;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireday = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }


    public double getSalary() {
        return salary;
    }


    public LocalDate getHireday() {
        return hireday;
    }

    public void raiseSalary(double percent) {
        double raise = salary * percent / 100;
        salary += raise;
    }
}
