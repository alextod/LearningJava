package com.lohika.lerningjava.patterns.Decorator;

/**
 * Created by atodorov on 1/19/2017.
 */
public class QuotesDecorator extends Decorator {

    public QuotesDecorator(PrinterInterface component) {
        super(component);
    }

    public void print() {
        System.out.print("\"");
        super.print();
        System.out.print("\"");
    }
}
