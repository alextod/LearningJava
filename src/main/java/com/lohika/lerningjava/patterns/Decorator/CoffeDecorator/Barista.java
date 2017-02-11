package com.lohika.lerningjava.patterns.Decorator.CoffeDecorator;

/**
 * Created by Alex on 11.02.2017.
 */
public class Barista {
    public static void main(String[] args) {
        CoffeeInterface coffee;
        coffee = new CoffeeWithSugar(new CoffeeWithMilk(new CoffeeWithCinnamon(new PlainCoffee())));
        System.out.println("Price: " + coffee.getCost());
        System.out.println("Details: " + coffee.getDescription());
    }
}
