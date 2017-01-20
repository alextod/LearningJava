package com.lohika.lerningjava.patterns.Adapter;

/**
 * Created by atodorov on 1/20/2017.
 */
public class VectorAdapterFromRaster extends RasterGraphics implements VectorGraphicsInterface {
    @Override
    public void drawLine() {
        drawRasterLine();
    }

    @Override
    public void drawSquare() {
        drawRasterSquare();
    }
}
