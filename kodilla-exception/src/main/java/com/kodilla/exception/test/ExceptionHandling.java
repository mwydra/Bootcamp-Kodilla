package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyWillthrowsException(1, 1.5);
        }catch (Exception e){
            System.out.println("There is error: " + e);
        }finally {
            System.out.println("Learning to handle exceptions.");
        }
    }
}
