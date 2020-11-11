package com.imooc.animal;

/**
 * 该程序是一个animal类
 * 里边有name，month
 */
public class animal {
    private String name;
    private int month;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public animal(String name, int month) {
        this.name = name;
        this.month = month;
    }

    public animal() {
    }

    public void eat(){
        System.out.println("动物都有吃东西的能力");
    }
}
