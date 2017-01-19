package com.lohika.lerningjava.patterns.Decorator;

/**
 * Created by atodorov on 1/19/2017.
 */
public class DecoratorProgram {
    public static void main(String[] args) {
        //PrinterInterface printer = new Printer("Hello");
        PrinterInterface printer = new QuotesDecorator(new RightBracketDecorator(new LeftBracketDecorator(new Printer("Hello"))));
        printer.print();
    }
}
