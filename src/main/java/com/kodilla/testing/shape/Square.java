package com.kodilla.testing.shape;

public class Square implements Shape{

    public String getShapeName(){
        return "square";
    }

    public double getField(int a){
        return a * a;
    }
}
