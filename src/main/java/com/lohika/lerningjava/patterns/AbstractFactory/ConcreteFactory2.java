package com.lohika.lerningjava.patterns.AbstractFactory;

/**
 * Created by atodorov on 10/14/2016.
 */
public class ConcreteFactory2 implements AbstractFactory {
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
