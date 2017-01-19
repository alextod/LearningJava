package com.lohika.lerningjava.patterns.Strategy;

/**
 * Created by atodorov on 10/14/2016.
 */
public class DivideStrategy implements Strategy {
    public void execute(int a, int b) {
        if(b!=0)
            System.out.println("Divide: " + (a/b));
        else
            System.out.println("Null division prohibited");
    }
}
