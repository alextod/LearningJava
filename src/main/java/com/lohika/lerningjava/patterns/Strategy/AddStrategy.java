package com.lohika.lerningjava.patterns.Strategy;

/**
 * Created by atodorov on 10/14/2016.
 */
public class AddStrategy implements Strategy {
    public void execute(int a, int b) {
        System.out.println("Add: " + (a + b));
    }
}
