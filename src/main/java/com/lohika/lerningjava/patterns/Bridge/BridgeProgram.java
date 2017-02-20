package com.lohika.lerningjava.patterns.Bridge;

public class BridgeProgram {

    public static void main(String[] args) {
        CarType car1 = new Sedan(new Kia());
        CarType car2 = new Hatchback(new Skoda());
        CarType car3 = new Sedan(new Mercedes());
        CarType car4 = new Coupe(new Mercedes());

        car1.showDetails();
        car2.showDetails();
        car3.showDetails();
        car4.showDetails();
    }


}
