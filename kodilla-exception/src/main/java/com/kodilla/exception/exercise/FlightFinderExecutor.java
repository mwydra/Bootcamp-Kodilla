package com.kodilla.exception.exercise;

public class FlightFinderExecutor {
    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        Flight flight = new Flight("Warsaw", "Paris");

        try {
            flightFinder.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("error");
        }

    }

}
