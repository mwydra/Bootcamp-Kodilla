package com.kodilla.testing.shape;

import org.junit.*;
import com.kodilla.testing.shape.*;

public class ShapeCollectorTestSuite {
    static int count = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is begining of tests.");
    }
    @Before
    public void beforeEachTest(){
        count++;
        System.out.println("I'm starting test number #" + count);
    }
    @AfterClass
    public static void afterTests(){
        System.out.println("End of tests.");
    }
    @Test
    public void testAddingFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle();
        //When
        shapeCollector.addFigure(circle);
        //Then
        Assert.assertEquals(1, shapeCollector.shapes.size());
    }
    @Test
    public void testRemovingFigureNotExisting(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle();
        //When
        boolean result = shapeCollector.removeFigure(circle);
        //Then
        Assert.assertFalse(result);
    }
    @Test
    public void testRemovingFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle();
        shapeCollector.shapes.add(circle);
        //When
        boolean result = shapeCollector.removeFigure(circle);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.shapes.size());
    }
    @Test
    public void testGettingFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle();
        shapeCollector.shapes.add(circle);
        //When
        Shape result = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(circle, result);
    }
    @Test
    public void testShowingFigures(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        shapeCollector.shapes.add(circle);
        shapeCollector.shapes.add(triangle);
        //When
        int result = shapeCollector.showFigures();
        //Then
        Assert.assertEquals(2, result);
    }
}
