package com.lohika.lerningjava.patterns.Builder;

/**
 * Created by Alex on 19.01.2017.
 */
public class FordMondeoBuilder extends AbstractCarBuilder {
    @Override
    void buildMake() {
        car.setMake("Ford Mondeo");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.AUTO);
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(260);
    }
}
