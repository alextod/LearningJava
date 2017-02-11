package com.lohika.lerningjava.patterns.Decorator.PrinterDecorator;

public class DecoratorProgram {
    public static void main(String[] args) {
        //PrinterInterface printer = new Printer("Hello");
        PrinterInterface printer = new QuotesDecorator(new RightBracketDecorator(new LeftBracketDecorator(new Printer("Hello"))));
        printer.print();
    }
}
