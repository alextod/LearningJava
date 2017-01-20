package com.lohika.lerningjava.patterns.ChainOfResponsibility;

/**
 * Created by atodorov on 1/20/2017.
 */
public class ChainProgram {
    public static void main(String[] args) {
        Logger smsLogger = new SMSLogger(LogLevel.ERROR);
        Logger fileLogger = new FileLogger(LogLevel.DEBUG);
        Logger emailLogger = new EmailLogger(LogLevel.INFO);

        smsLogger.setNext(fileLogger);
        fileLogger.setNext(emailLogger);

        smsLogger.writeMessage("Everything's fine", LogLevel.INFO);
        smsLogger.writeMessage("Debug in progress", LogLevel.DEBUG);
        smsLogger.writeMessage("System failure!", LogLevel.ERROR);
    }
}
