package com.lohika.lerningjava.patterns.Decorator.PrinterDecorator;

public class LeftBracketDecorator extends Decorator{

    public LeftBracketDecorator(PrinterInterface component) {
        super(component);
    }

    public void print() {
        System.out.print("[");
        super.print();
    }
}
