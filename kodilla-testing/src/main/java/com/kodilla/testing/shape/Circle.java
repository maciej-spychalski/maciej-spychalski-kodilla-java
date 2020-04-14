package com.kodilla.testing.shape;

import static java.lang.Math.PI;

public class Circle implements Shape {
    private String shapeName = "Circle";
    private int circleRadius = 1;


    public String getShapeName() {
        return this.shapeName;
    }

    public double getField() {
        return PI * circleRadius*circleRadius;
    }
}
