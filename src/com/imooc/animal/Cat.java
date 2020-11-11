package com.imooc.animal;

/**
 *这是一个猫类，继承自animal类，重写了animal的eat方法
 *
 */
public class Cat extends animal{
    private double weight;

    public Cat(String name, int month, double weight) {
        super(name, month);
        this.weight = weight;
    }

    public Cat(){

    }

    public void run(){
        System.out.println("小猫快跑");
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
