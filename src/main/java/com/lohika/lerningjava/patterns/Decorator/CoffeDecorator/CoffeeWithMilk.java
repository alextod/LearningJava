package com.lohika.lerningjava.patterns.Decorator.CoffeDecorator;

/**
 * Created by Alex on 11.02.2017.
 */
public class CoffeeWithMilk extends CoffeeDecorator {
    public CoffeeWithMilk(CoffeeInterface decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with milk";
    }
}
