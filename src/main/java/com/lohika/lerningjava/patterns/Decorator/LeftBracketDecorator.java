package com.lohika.lerningjava.patterns.Decorator;

/**
 * Created by atodorov on 1/19/2017.
 */
public class LeftBracketDecorator extends Decorator{

    public LeftBracketDecorator(PrinterInterface component) {
        super(component);
    }

    public void print() {
        System.out.print("[");
        super.print();
    }
}
