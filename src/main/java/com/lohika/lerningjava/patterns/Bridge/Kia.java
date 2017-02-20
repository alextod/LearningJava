package com.lohika.lerningjava.patterns.Bridge;

public class Kia implements Make {
    @Override
    public void setMake() {
        System.out.println("Kia");
    }
}
