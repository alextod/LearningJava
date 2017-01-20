package com.lohika.lerningjava.patterns.ChainOfResponsibility;

/**
 * Created by atodorov on 1/20/2017.
 */
public class SMSLogger extends Logger {

    public SMSLogger(int priority) {
        super(priority);
    }

    @Override
    public void write(String message){
        System.out.println("SMS: " + message);
    }
}
