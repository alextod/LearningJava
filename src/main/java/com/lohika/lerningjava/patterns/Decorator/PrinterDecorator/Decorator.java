package com.lohika.lerningjava.patterns.Decorator.PrinterDecorator;

public abstract class Decorator implements PrinterInterface {

    private PrinterInterface component;

    public Decorator(PrinterInterface printerInterface) {
        this.component = printerInterface;
    }

    public void print() {
        component.print();
    }
}
