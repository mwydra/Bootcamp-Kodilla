package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> shapes = new ArrayList<Shape>();

    public void addFigure(Shape shape){
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if(shapes.contains(shape)){
            shapes.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n){
        Shape shape = null;
        if(n >= 0 && n < shapes.size()){
            shape = shapes.get(n);
        }
        return shape;
    }

    public String showFigures(){
        String result = "";
        if(shapes.size() > 0){
            for(int i = 0; i < shapes.size(); i++){
                result += shapes.get(i).getShapeName() + ", ";
            }
        }
        else{
            result = "There are no shapes.";
        }
        return result;
    }
}
