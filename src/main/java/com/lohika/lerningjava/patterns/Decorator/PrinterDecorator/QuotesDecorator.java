package com.lohika.lerningjava.patterns.Decorator.PrinterDecorator;

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
