package com.lohika.lerningjava.patterns.Builder;

/**
 * Created by Alex on 19.01.2017.
 */
public class CarBuilder {
    String make = "Default";
    Transmission transmission = Transmission.MANUAL;
    int speed = 120;

    CarBuilder buildMake(String make){
        this.make = make;
        return this;
    }

    CarBuilder buildTransmission(Transmission transmission){
        this.transmission = transmission;
        return this;
    }

    CarBuilder buildMaxSpeed(int speed){
        this.speed = speed;
        return this;
    }

    Car build(){
        Car car = new Car();
        car.setMake(make);
        car.setTransmission(transmission);
        car.setMaxSpeed(speed);
        return car;
    }
}
