package com.lohika.lerningjava.patterns.Composite.Car.steering;

import com.lohika.lerningjava.patterns.Composite.Car.CarDetail;

public class Accelerator implements CarDetail {
    @Override
    public void printDetail() {
        System.out.println("Accelerator");
    }
}
