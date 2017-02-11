package com.lohika.lerningjava.patterns.Decorator.CoffeDecorator;

/**
 * Created by Alex on 11.02.2017.
 */
public class CoffeeWithCinnamon extends CoffeeDecorator{
    public CoffeeWithCinnamon(CoffeeInterface decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.7;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with cinnamon";
    }
}
