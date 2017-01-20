package com.lohika.lerningjava.patterns.Command;

/**
 * Created by atodorov on 1/20/2017.
 */
public class UserInvoker {
    private Command start;
    private Command stop;
    private Command reset;

    public UserInvoker(Command start, Command stop, Command reset) {
        this.start = start;
        this.stop = stop;
        this.reset = reset;
    }

    public void startComputer(){
        start.execute();
    }

    public void stopComputer(){
        stop.execute();
    }

    public void resetComputer(){
        reset.execute();
    }
}
