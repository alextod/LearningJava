package com.lohika.lerningjava.patterns.Adapter;

/**
 * Created by atodorov on 1/20/2017.
 */
public class VectorAdapterFromRaster2 implements VectorGraphicsInterface {

    RasterGraphics raster = new RasterGraphics();

    @Override
    public void drawLine() {
        raster.drawRasterLine();
    }

    @Override
    public void drawSquare() {
        raster.drawRasterSquare();
    }
}
