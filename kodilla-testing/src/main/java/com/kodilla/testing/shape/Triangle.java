package com.kodilla.testing.shape;

public class Triangle implements Shape {
    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField(int a) {
        return (a*a)/2;
    }
}
