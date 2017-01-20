package com.lohika.lerningjava.patterns.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by atodorov on 1/20/2017.
 */
public class Composite implements Shape {

    private List<Shape> components = new ArrayList<>();

    public void addComponent(Shape component){
        components.add(component);
    }

    public void removeComponent(Shape component){
        components.remove(component);
    }

    public void draw() {
        components.stream().forEach(Shape::draw);
    }
}
