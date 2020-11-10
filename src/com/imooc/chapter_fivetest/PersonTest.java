package com.imooc.chapter_fivetest;
import com.imooc.chapter_five.Employee;
import com.imooc.chapter_five.Person;
import com.imooc.chapter_five.Student;


public class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[2];

        //fill the people with Students and Employee objects
        people[0]=new Employee("Harry Hacker",50000,1989,10,1);
        people[1]=new Student("Maria Morris","computer science");

        //print out names and description of all people objects
        for (Person p : people){
            System.out.println(p.getName()+p.getDescription());
        }
    }
}
