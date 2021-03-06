package com.kodilla.spring.library;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootTest(properties = "spring.main.allow-bean-definition-overriding=true")
public class LibraryTestSuite {
    @Test
    public void testLoadFromDb(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Library library = context.getBean(Library.class);
        //When
        library.loadFromDb();
        //Then
        //
    }

    @Test
    public void testSaveFromDb(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Library library = context.getBean(Library.class);
        //When
        library.saveToDb();
        //Then
        //
    }

    @Test
    public void testContext(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        //When & Then
        System.out.println("===== Beans list: ===== >>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<< ===== Beans list =====");
    }
}
