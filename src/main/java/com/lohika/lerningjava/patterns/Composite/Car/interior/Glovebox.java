package com.lohika.lerningjava.patterns.Composite.Car.interior;

import com.lohika.lerningjava.patterns.Composite.Car.CarDetail;

public class Glovebox implements CarDetail {
    @Override
    public void printDetail() {
        System.out.println("Glovebox");
    }
}
