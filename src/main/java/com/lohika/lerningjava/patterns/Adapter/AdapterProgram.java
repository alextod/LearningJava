package com.lohika.lerningjava.patterns.Adapter;

/**
 * Created by atodorov on 1/20/2017.
 */
public class AdapterProgram {
    public static void main(String[] args) {

        // 1 way - inheritance
        VectorGraphicsInterface g1 = new VectorAdapterFromRaster();
        g1.drawLine();
        g1.drawSquare();

        // 2 way - composition
        VectorGraphicsInterface g2 = new VectorAdapterFromRaster2();
        g2.drawLine();
        g2.drawSquare();

    }
}
