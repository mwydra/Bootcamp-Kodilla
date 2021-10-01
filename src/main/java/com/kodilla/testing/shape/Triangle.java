package com.kodilla.testing.shape;

public class Triangle implements Shape{
    public String getShapeName(){
        return "triangle";
    }

    public double getField(int a){
        return (a * a)/2;
    }
}
