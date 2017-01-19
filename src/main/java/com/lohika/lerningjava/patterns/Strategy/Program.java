package com.lohika.lerningjava.patterns.Strategy;

/**
 * Created by atodorov on 10/14/2016.
 */
public class Program {
    public static void main(String[] args) {
        Strategy strategy = new AddStrategy();
        strategy.execute(3, 5);
        strategy = new MultiplyStrategy();
        strategy.execute(4, 6);
        strategy = new SubtractStrategy();
        strategy.execute(8, 5);
        strategy = new DivideStrategy();
        strategy.execute(7,2);

        System.out.println("Context");

        Context context = new Context();
        context.setStrategy(new AddStrategy());
        context.executeStrategy(6,7);

    }
}
