package com.lohika.lerningjava.patterns.ChainOfResponsibility;

/**
 * Created by atodorov on 1/20/2017.
 */
public class EmailLogger extends Logger {

    public EmailLogger(int priority) {
        super(priority);
    }

    @Override
    public void write(String message){
        System.out.println("E-Mail: " + message);
    }
}
