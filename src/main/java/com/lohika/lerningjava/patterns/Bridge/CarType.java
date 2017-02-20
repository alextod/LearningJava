package com.lohika.lerningjava.patterns.Bridge;

public abstract class CarType {

    Make make;

    public CarType(Make make){
        this.make = make;
    }

    public void showDetails(){
        System.out.print(this.getClass().getSimpleName() + " ");
        make.setMake();
    }

}
