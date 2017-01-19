package com.lohika.lerningjava.patterns.Strategy;

/**
 * Created by atodorov on 10/14/2016.
 */
public class MultiplyStrategy implements Strategy {
    public void execute(int a, int b) {
        System.out.println("Multiply: " + (a*b));
    }
}
