package com.lohika.lerningjava.abstractions;

import com.lohika.lerningjava.exceptions.BaseballException;
import com.lohika.lerningjava.exceptions.Foul;
import com.lohika.lerningjava.exceptions.Strike;

/**
 * Created by atodorov on 12/14/2015.
 */
public abstract class Inning {
    public Inning() throws BaseballException {}

    public void event() throws BaseballException{
        System.out.println("Event from INNING");
    }
    public abstract void atBat() throws Strike, Foul;
    public void walk(){}
}
