package com.kodilla.testing.library;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {

    public List<Book> generateListOfNBooks(int bookQuantity){
        List<Book> theList = new ArrayList<Book>();
        for(int i = 1; i <= bookQuantity; i++){
            Book theBook = new Book("Title " + i, "Author " + i, 2000 + i);
            theList.add(theBook);
        }
        return theList;
    }

    @Test
    public void testListBooksWithConditionReturnList(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListBooks = new ArrayList<Book>();
        Book book1 = new Book("Title 1", "Author 1", 2001);
        Book book2 = new Book("Title 2", "Author 2", 2002);
        Book book3 = new Book("Title 3", "Author 3", 2003);
        Book book4 = new Book("Title 4", "Author 4", 2004);
        resultListBooks.add(book1);
        resultListBooks.add(book2);
        resultListBooks.add(book3);
        resultListBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Title")).thenReturn(resultListBooks);
        //When
        List<Book> resultList = bookLibrary.listBooksWithCondition("Title");
        //Then
        Assert.assertEquals(4, resultList.size());
    }

    @Test
    public void testListBooksWithConditionMoreThan20(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks")).thenReturn(resultListOf40Books);
        //When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        //Then
        Assert.assertEquals(0, theListOfBooks0.size());
        Assert.assertEquals(15, theListOfBooks15.size());
        Assert.assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf10Books);
        //When
        List<Book> theListOdBooks10 = bookLibrary.listBooksWithCondition("An");
        //Then
        Assert.assertEquals(0, theListOdBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    public void testListBooksInHandsOfBooks(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf5Books = generateListOfNBooks(5);
        List<Book> resultListOf1Books = generateListOfNBooks(1);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        LibraryUser user1 = new LibraryUser("John", "Smith", "80010110011");
        LibraryUser user2 = new LibraryUser("Paul", "Wats", "99121299100");
        LibraryUser user3 = new LibraryUser("Carl", "McKinley", "70050533456");
        when(libraryDatabaseMock.listBooksInHandsOf(user1)).thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksInHandsOf(user2)).thenReturn(resultListOf1Books);
        when(libraryDatabaseMock.listBooksInHandsOf(user3)).thenReturn(resultListOf5Books);
        //When
        List<Book> resultList1 = bookLibrary.listBooksInHandsOf(user1);
        List<Book> resultList2 = bookLibrary.listBooksInHandsOf(user2);
        List<Book> resultList3 = bookLibrary.listBooksInHandsOf(user3);
        //Then
        Assert.assertEquals(0, resultList1.size());
        Assert.assertEquals(1, resultList2.size());
        Assert.assertEquals(5, resultList3.size());
    }
}
