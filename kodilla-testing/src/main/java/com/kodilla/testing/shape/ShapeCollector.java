package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> figureList;

    public ShapeCollector() {
        figureList = new ArrayList<Shape>();
    }

    public void addFigure(Shape shape) {
        figureList.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean removed;
        removed = figureList.remove(shape);
        return removed;
    }

    public Shape getFigure(int n) {
        return figureList.get(n);
    }
}
