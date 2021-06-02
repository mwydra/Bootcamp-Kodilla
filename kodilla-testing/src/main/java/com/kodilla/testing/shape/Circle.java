package com.kodilla.testing.shape;

public class Circle implements Shape {

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getField(int a) {
        return 3.14*(a*a);
    }
}
