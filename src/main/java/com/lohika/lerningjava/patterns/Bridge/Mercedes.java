package com.lohika.lerningjava.patterns.Bridge;

public class Mercedes implements Make {
    @Override
    public void setMake() {
        System.out.println("Mercedes");
    }
}
