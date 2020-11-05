package com.java.constructor;

import java.util.Random;

public class Employee {
    private static int nextId;

    private int id;
    private String name="";
    private double salary;

    //static initialize block
    static {
        Random generator = new Random();
        //set nextId to a random number between 0 and 9999
        nextId = generator.nextInt(10000);
    }

    //three overloaded constructors
    public Employee(String n,double s){
        name = n;
        salary = s;
    }

    public Employee(double s){
        //calls the Employee(String double) constructor
        this("Employee #"+nextId,s);
    }

    //the default constructor
    public Employee(){
        //name initialize to ""--see me
        //salary not explicity set--initialize to 0;
        //id initialized in initialize block
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public int getId() {
        return id;
    }
}
