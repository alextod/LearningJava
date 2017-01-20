package com.lohika.lerningjava.patterns.Command;

/**
 * Created by atodorov on 1/20/2017.
 */
public class StartCommand implements Command {
    Comp computer;

    public StartCommand(Comp computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.start();
    }
}
