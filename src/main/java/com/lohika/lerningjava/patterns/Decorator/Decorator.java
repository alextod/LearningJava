package com.lohika.lerningjava.patterns.Decorator;

/**
 * Created by atodorov on 1/19/2017.
 */
public abstract class Decorator implements PrinterInterface {

    PrinterInterface component;

    public Decorator(PrinterInterface printerInterface) {
        this.component = printerInterface;
    }

    public void print() {
        component.print();
    }
}
