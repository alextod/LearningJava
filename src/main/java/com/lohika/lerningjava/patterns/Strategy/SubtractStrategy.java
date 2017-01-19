package com.lohika.lerningjava.patterns.Strategy;

/**
 * Created by atodorov on 10/14/2016.
 */
public class SubtractStrategy implements Strategy {
    public void execute(int a, int b) {
        System.out.println("Subtract: " + (a - b));
    }
}
