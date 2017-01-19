package com.lohika.lerningjava.patterns.FactoryMethod;

/**
 * Created by atodorov on 10/14/2016.
 */
public class Program {
    public static void main(String[] args) {
        Factory computerFactory = new ComputerFactory();
        Factory phoneFactory = new PhoneFactory();
        computerFactory.createProduct();
        phoneFactory.createProduct();

    }
}
