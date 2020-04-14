package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String shapeName = "Triangle";
    private int trinagleHeight = 1;
    private int triangleBase = 1;

    public String getShapeName() {
        return this.shapeName;
    }

    public double getField() {
        return 0.5 * trinagleHeight * triangleBase;
    }
}
