package com.kodilla.exception.exercise;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<String, Boolean>();
        airports.put("dupa", true);
        airports.put("dupa", true);

        String airportDeparture = flight.getDepartureAirport();
        String airportArrival = flight.getArrivalAirport();

        if(airports.containsKey(airportDeparture) && airports.containsKey(airportArrival)){
            System.out.println("działa");
        }
        throw new RouteNotFoundException("Route not found!");
    }
}
