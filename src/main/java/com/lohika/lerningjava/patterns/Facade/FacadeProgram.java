package com.lohika.lerningjava.patterns.Facade;

/**
 * Created by Alex on 19.01.2017.
 */
public class FacadeProgram {
    public static void main(String[] args) {
//        Power power = new Power();
//        power.on();
//
//        DVDRom dvdRom = new DVDRom();
//        dvdRom.load();
//
//        HDD hdd = new HDD();
//        hdd.copyFromDVD(dvdRom);

        Computer computer = new Computer();
        computer.copy();

    }
}
