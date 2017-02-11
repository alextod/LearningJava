package com.lohika.lerningjava.patterns.Decorator.PrinterDecorator;

public class Printer implements PrinterInterface {

    private String value;

    public Printer(String value) {
        this.value = value;
    }

    public void print() {
        System.out.print(value);
    }
}
