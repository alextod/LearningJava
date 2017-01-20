package com.lohika.lerningjava.patterns.ChainOfResponsibility;

/**
 * Created by atodorov on 1/20/2017.
 */
public class FileLogger extends Logger {

    public FileLogger(int priority) {
        super(priority);
    }

    @Override
    public void write(String message){
        System.out.println("File: " + message);
    }
}
