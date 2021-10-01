package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite {

    @Test
    public void testAddingFigure(){
        //Given
        ShapeCollector collector = new ShapeCollector();
        //When
        collector.addFigure(new Circle());
        //Then
        Assert.assertEquals(1, collector.shapes.size());
        Assert.assertEquals("circle", collector.shapes.get(0).getShapeName());
    }

    @Test
    public void testRemovingFigure(){
        //Given
        ShapeCollector collector = new ShapeCollector();
        Triangle triangle = new Triangle();
        collector.addFigure(triangle);
        //When
        collector.removeFigure(triangle);
        //Then
        Assert.assertEquals(0, collector.shapes.size());
    }

    @Test
    public void testGettingFigure(){
        //Given
        ShapeCollector collector = new ShapeCollector();
        Square square = new Square();
        collector.addFigure(square);
        //When
        Shape resultShape = collector.getFigure(0);
        //Then
        Assert.assertEquals(square, resultShape);
    }

    @Test
    public void testShowingFiguresWhenCollectionIsEmpty(){
        //Given
        ShapeCollector collector = new ShapeCollector();
        //When
        String result = collector.showFigures();
        //Then
        Assert.assertEquals("There are no shapes.", result);
    }

    @Test
    public void testShowingFigures(){
        //Given
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(new Square());
        collector.addFigure(new Circle());
        collector.addFigure(new Triangle());
        //When
        String result = collector.showFigures();
        //Then
        Assert.assertEquals("square, circle, triangle, ", result);
    }

}
