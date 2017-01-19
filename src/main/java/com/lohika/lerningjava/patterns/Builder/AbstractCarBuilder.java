package com.lohika.lerningjava.patterns.Builder;

/**
 * Created by Alex on 19.01.2017.
 */
public abstract class AbstractCarBuilder {
    Car car;
    void createCar(){
        car = new Car();
    }

    abstract void buildMake();
    abstract void buildTransmission();
    abstract void buildMaxSpeed();

    Car getCar(){
        return car;
    }
}
