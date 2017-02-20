package com.lohika.lerningjava.patterns.Composite.Car;

import java.util.ArrayList;
import java.util.List;

public class CarComposite implements CarDetail {

    List<CarDetail> carDetails = new ArrayList<>();

    public void addDetail(CarDetail detail){
        carDetails.add(detail);
    }

    public void removeDetail(CarDetail detail){
        carDetails.remove(detail);
    }

    @Override
    public void printDetail() {
        carDetails.forEach(CarDetail::printDetail);
    }
}
