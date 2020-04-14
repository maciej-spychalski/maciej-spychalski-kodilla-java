package com.kodilla.testing.shape;

import static java.lang.Math.PI;

public class Square implements Shape {
    private String shapeName = "Square";
    private int squareSide = 1;


    public String getShapeName() {
        return this.shapeName;
    }

    public double getField() {
        return squareSide*squareSide;
    }
}
