package com.lohika.lerningjava.patterns.Composite.Car.chassis;

import com.lohika.lerningjava.patterns.Composite.Car.CarDetail;

public class Clutch implements CarDetail {
    @Override
    public void printDetail() {
        System.out.println("Clutch");
    }
}
