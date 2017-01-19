package com.lohika.lerningjava.patterns.Decorator;

/**
 * Created by atodorov on 1/19/2017.
 */
public class RightBracketDecorator extends Decorator {


    public RightBracketDecorator(PrinterInterface component) {
        super(component);
    }

    public void print() {
        super.print();
        System.out.print("]");
    }
}
