package com.lohika.lerningjava.patterns.Composite.Car.steering;

import com.lohika.lerningjava.patterns.Composite.Car.CarDetail;

public class SteeringWheel implements CarDetail {
    @Override
    public void printDetail() {
        System.out.println("Steering Wheel");
    }
}
