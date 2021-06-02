package com.kodilla.testing.shape;

public class Square implements Shape {
    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public double getField(int a) {
        return a*a;
    }
}
