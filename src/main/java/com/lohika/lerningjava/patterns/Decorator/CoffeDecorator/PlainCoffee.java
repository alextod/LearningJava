package com.lohika.lerningjava.patterns.Decorator.CoffeDecorator;

/**
 * Created by Alex on 11.02.2017.
 */
public class PlainCoffee implements CoffeeInterface {
    @Override
    public double getCost() {
        return 3;
    }

    @Override
    public String getDescription() {
        return "Coffee";
    }
}
