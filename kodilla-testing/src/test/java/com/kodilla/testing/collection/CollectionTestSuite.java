package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Begining test name: ");
    }
    @After
    public void after(){
        System.out.println("Ending test.");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //When
        ArrayList<Integer> result = exterminator.exterminate(numbers);
        System.out.println("Empty list");
        //Then
        Assert.assertTrue(result.size() == 0);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i = 1; i <= 10; i++){
            numbers.add(i);
        }
        //When
        ArrayList<Integer> result = exterminator.exterminate(numbers);
        System.out.println("Normal list");
        //Then
        Assert.assertTrue(result.size() == 5);
        Assert.assertArrayEquals(Arrays.asList(2,4,6,8,10).toArray(), result.toArray());
    }
}
