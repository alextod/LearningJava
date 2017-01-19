package com.lohika.lerningjava.patterns.AbstractFactory;

/**
 * Created by atodorov on 10/14/2016.
 */
public class ProductB2 implements AbstractProductB {
    public void interact(AbstractProductA abstractProductA) {
        System.out.println(abstractProductA.getClass().getName() + " interacts with " + this.getClass().getName());
    }
}
