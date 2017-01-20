package com.lohika.lerningjava.patterns.ChainOfResponsibility;

/**
 * Created by atodorov on 1/20/2017.
 */
public abstract class Logger {
    int priority;
    Logger next;

    public Logger(int priority) {
        this.priority = priority;
    }

    public void setNext(Logger next) {
        this.next = next;
    }

    abstract void write(String message);

    public void writeMessage(String message, int level) {
        if(level<=priority){
            write(message);
        }
        if(next != null){
            next.writeMessage(message, level);
        }
    }
}
