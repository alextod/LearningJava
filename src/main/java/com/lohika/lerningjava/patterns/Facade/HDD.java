package com.lohika.lerningjava.patterns.Facade;

/**
 * Created by Alex on 19.01.2017.
 */
public class HDD {
    void copyFromDVD(DVDRom dvdRom){
        if(dvdRom.hasData()){
            System.out.println("Copying data from DVD");
        }
        else{
            System.out.println("Please load DVDRom");
        }
    }
}
