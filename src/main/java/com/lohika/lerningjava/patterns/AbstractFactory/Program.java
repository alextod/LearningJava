package com.lohika.lerningjava.patterns.AbstractFactory;

/**
 * Created by atodorov on 10/14/2016.
 */
public class Program {
    public static void main(String[] args) {
        Client client = new Client(new ConcreteFactory1());
        client.execute();

        client = new Client(new ConcreteFactory2());
        client.execute();
    }
}
