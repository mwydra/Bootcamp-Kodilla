package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OldNumbersExterminator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @Test
    public void testOldNumbersExterminatorEmptyList(){
        //Given
        OldNumbersExterminator exterminator = new OldNumbersExterminator();
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        //When
        ArrayList<Integer> result = exterminator.exterminate(emptyList);
        //Then
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void testOldNumbersExterminatorNormalList(){
        //Given
        OldNumbersExterminator exterminator = new OldNumbersExterminator();
        ArrayList<Integer> normalList = new ArrayList<Integer>();
        for(int i = 1; i <= 10; i++){
            normalList.add(i);
        }
        //When
        ArrayList<Integer> result = exterminator.exterminate(normalList);
        //Then
        Assert.assertEquals(5, result.size());
    }
}
