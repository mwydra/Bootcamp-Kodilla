package com.kodilla.exception.exercise;

public class RouteNotFoundException extends Exception{
    public RouteNotFoundException(final String message) {
        super(message);
    }
}
