package com.kodilla.stream.book;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.IntStream;

public class BookTestSuite {
    @Test
    public void testGetListUsingFor(){
        //Given
        BookDirectory bookDirectory = new BookDirectory();
        //When
        List<Book> resultList = bookDirectory.getList();
        //Then
        int numberOfBooksPublicatedAfter2007 = 0;
        for(Book book : resultList){
            if(book.getYearOfPublication() > 2007){
                numberOfBooksPublicatedAfter2007++;
            }
        }
        Assert.assertEquals(3, numberOfBooksPublicatedAfter2007);
    }

    @Test
    public void testGetListUsingIntStream(){
        //Given
        BookDirectory bookDirectory = new BookDirectory();
        //When
        List<Book> resultList = bookDirectory.getList();
        //Then
        int numberOfBooksPublicatedAfter2007withSum = IntStream.range(0, resultList.size())
                .filter(n -> resultList.get(n).getYearOfPublication() > 2007)
                .map(n -> 1)
                .sum();
        int numberOfBooksPublicatedAfter2007withCount = IntStream.range(0, resultList.size())
                .filter(n -> resultList.get(n).getYearOfPublication() > 2007)
                .map(n -> 1)
                .sum();
        Assert.assertEquals(3, numberOfBooksPublicatedAfter2007withSum);
        Assert.assertEquals(3, numberOfBooksPublicatedAfter2007withCount);
    }
}
