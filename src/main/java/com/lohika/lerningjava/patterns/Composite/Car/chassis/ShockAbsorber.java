package com.lohika.lerningjava.patterns.Composite.Car.chassis;

import com.lohika.lerningjava.patterns.Composite.Car.CarDetail;

public class ShockAbsorber implements CarDetail{
    @Override
    public void printDetail() {
        System.out.println("Shock absorber");
    }
}
