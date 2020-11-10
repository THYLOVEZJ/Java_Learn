package com.imooc.chapter_five;

import java.time.LocalDate;

public class Employee extends Person {
    private double salary;
    private LocalDate hireday;

    public Employee(String name,double salary,int year,int month,int day){
        super(name);
        this.salary=salary;
        this.hireday=LocalDate.of(year,month,day);
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireday() {
        return hireday;
    }

    @Override
    public String getDescription() {
        return  String.format("an employee with a salary of $%.2f",salary);
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent/100;
        salary+=raise;
    }
}
