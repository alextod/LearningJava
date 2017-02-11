package com.lohika.lerningjava.patterns.Decorator.CoffeDecorator;

/**
 * Created by Alex on 11.02.2017.
 */
public class CoffeeDecorator implements CoffeeInterface {

    CoffeeInterface decoratedCoffee;

    public CoffeeDecorator(CoffeeInterface decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost();
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }
}
