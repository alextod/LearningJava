package com.lohika.lerningjava.patterns.Composite.Car.chassis;

import com.lohika.lerningjava.patterns.Composite.Car.CarDetail;

public class Wheel implements CarDetail {
    @Override
    public void printDetail() {
        System.out.println("Wheel 215/45/17");
    }
}
