package com.lohika.lerningjava.patterns.FactoryMethod;

/**
 * Created by atodorov on 10/14/2016.
 */
public class ComputerFactory extends Factory {
    @Override
    public Product createProduct() {
        return new ComputerProduct();
    }
}
