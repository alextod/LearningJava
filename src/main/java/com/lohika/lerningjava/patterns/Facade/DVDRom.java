package com.lohika.lerningjava.patterns.Facade;

/**
 * Created by Alex on 19.01.2017.
 */
public class DVDRom {
    private boolean data = false;
    public boolean hasData(){
        return data;
    }

    public void load(){
        data = true;
    }
    public void unload(){
        data = false;
    }
}
