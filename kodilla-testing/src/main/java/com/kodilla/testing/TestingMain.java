package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Triangle;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Circle());
        shapeCollector.addFigure(new Triangle());
        shapeCollector.showFigures();
    }
}
