package com.lohika.lerningjava;

import com.lohika.lerningjava.abstractions.Inning;
import com.lohika.lerningjava.abstractions.Storm;
import com.lohika.lerningjava.exceptions.*;

public class StormyInning extends Inning implements Storm {

    public StormyInning() throws RainedOut, BaseballException {

    }

    public StormyInning(String s) throws Foul, BaseballException{}

    @Override
    public void atBat() throws Strike, Foul {}

    public void rainHard() throws RainedOut {}

    @Override
    public void event(){}

    public void walk() {}

    public static void main(String[] args){
        try {
            StormyInning stormyInning = new StormyInning();
            stormyInning.atBat();
            stormyInning.event();
            stormyInning.walk();
        } catch (PopFoul e){
            System.out.println("Pop foul");
        } catch (RainedOut rainedOut) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Common exception");
        }

        try {
            Inning inning = new StormyInning();
            inning.atBat();
            inning.event();
            inning.walk();
        } catch (Strike strike) {
            System.out.println("Strike");
        } catch (Foul foul) {
            System.out.println("Foul");
        } catch (RainedOut rainedOut) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Common exception");
        }




    }
}
