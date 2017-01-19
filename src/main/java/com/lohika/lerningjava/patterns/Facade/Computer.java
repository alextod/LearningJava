package com.lohika.lerningjava.patterns.Facade;

/**
 * Created by Alex on 19.01.2017.
 */
public class Computer {

    private Power power = new Power();
    DVDRom dvdRom = new DVDRom();
    HDD hdd = new HDD();

    public void copy(){
        power.on();
        dvdRom.load();
        hdd.copyFromDVD(dvdRom);
    }
}
