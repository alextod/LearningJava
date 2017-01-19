package com.lohika.lerningjava.patterns.Builder;

/**
 * Created by Alex on 19.01.2017.
 */
public class BuilderProgram {
    public static void main(String[] args) {
        Car car = new CarBuilder()
                .buildMake("Mercedes")
                .buildTransmission(Transmission.AUTO)
                .buildMaxSpeed(280)
                .build();
        System.out.println(car);

        Director director = new Director();
        director.setBuilder(new SubaruBuilder());
        Car subaru = director.buildCar();
        System.out.println(subaru);

        director.setBuilder(new FordMondeoBuilder());
        Car ford = director.buildCar();
        System.out.println(ford);

    }
}
