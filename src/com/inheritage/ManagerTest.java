package com.inheritage;

public class ManagerTest {
    public static void main(String[] args) {
        //construct a Manager object
        Manger boss = new Manger("Carl Cracker",80000,1987,12,15);
        boss.setBonus(5000);

        Employee[] staff = new Employee[3];

        //fill the staff array with manager and Employee objects

        staff[0]=boss;
        staff[1]=new Employee("Harry Hacker",50000,1989,10,1);
        staff[2]=new Employee("Tommy tester",40000,1990,3,15);

        //print out the information about all objects
        for (Employee e:staff)
            System.out.println("name="+e.getName()+",salary="+e.getSalary());
    }
}
