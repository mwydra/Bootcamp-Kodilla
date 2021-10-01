package com.kodilla.testing.shape;

public class Circle implements Shape{
    public String getShapeName(){
        return "circle";
    }

    public double getField(int a){
        return 3.14 * (a*a);
    }
}
