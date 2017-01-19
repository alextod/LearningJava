package com.lohika.lerningjava.patterns.AbstractFactory;

/**
 * Created by atodorov on 10/14/2016.
 */
public class ConcreteFactory1 implements AbstractFactory {
    public AbstractProductA createProductA() {
        return new ProductA();
    }

    public AbstractProductB createProdcutB() {
        return new ProductB();
    }
}