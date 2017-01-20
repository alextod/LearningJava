package com.lohika.lerningjava.patterns.Command;

/**
 * Created by atodorov on 1/20/2017.
 */
public class CommandProgram {
    public static void main(String[] args) {
        Comp c = new Comp();

        UserInvoker user = new UserInvoker(new StartCommand(c), new StopCommand(c), new ResetCommand(c));

        user.startComputer();
        user.stopComputer();
        user.resetComputer();

    }
}
