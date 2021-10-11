package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;

public class ExceptionModuleRunner {

    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        //fileReader.readFile();

        //FileReadingWithoutHandling fileReadingWithoutHandling = new FileReadingWithoutHandling();
        //fileReadingWithoutHandling.readFile();

        try{
            fileReader.readFile();
        }catch (FileReaderException e){
            System.out.println("Problem while reading a file!");
        }
    }
}
