package com.lohika.lerningjava.patterns.Command;

/**
 * Created by atodorov on 1/20/2017.
 */
public class ResetCommand implements Command {
    Comp computer;

    public ResetCommand(Comp computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.reset();
    }
}
