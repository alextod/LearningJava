package com.lohika.lerningjava.patterns.AbstractFactory;

/**
 * Created by atodorov on 10/14/2016.
 */
public class Client {
    private AbstractProductA productA;
    private AbstractProductB productB;

    public Client(AbstractFactory abstractFactory) {
        productA = abstractFactory.createProductA();
        productB = abstractFactory.createProdcutB();
    }

    public void execute(){
        productB.interact(productA);
    }
}
