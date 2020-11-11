package com.imooc.test.com.imooc;
import com.imooc.animal.*;

/**
 * 这是一个测试类，主要为了测试多态
 */
public class test {
    public static void main(String[] args) {
        animal one=new animal();
        /*向上转型，父类指向子类实例
         可以调用父类重写方法，但是无法调用自类自身方法
         */
        animal two=new Cat();
        animal three=new Dog();

        one.eat();
        two.eat();
        three.eat();
    }
}
