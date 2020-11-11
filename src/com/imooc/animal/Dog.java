package com.imooc.animal;

/**
 * 这是一个dog类，重写了animal的eat（）方法
 */
public class Dog extends animal {
    private String sex;

    public Dog() {

    }

    public Dog(String name, int month, String sex) {
        super(name, month);
        this.sex = sex;
    }

    public void sleep() {
        System.out.println("狗在睡觉");
    }

    @Override
    public void eat() {
        System.out.println("狗爱吃肉");
    }
}
