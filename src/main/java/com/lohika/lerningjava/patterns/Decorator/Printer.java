package com.lohika.lerningjava.patterns.Decorator;

/**
 * Created by atodorov on 1/19/2017.
 */
public class Printer implements PrinterInterface {

    String value;

    public Printer(String value) {
        this.value = value;
    }

    public void print() {
        System.out.print(value);
    }
}
