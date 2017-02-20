package com.lohika.lerningjava.patterns.Bridge;

public class Skoda implements Make {

    @Override
    public void setMake() {
        System.out.println("Skoda");
    }
}
