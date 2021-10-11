package com.kodilla.good.patterns.SmallAirlines;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfFlights {
    City warsaw = new City("Warszawa");
    City krakow = new City("Kraków");
    City wroclaw = new City("Wrocław");
    City gdansk = new City("Gdańsk");
    City katowice = new City("Katowice");
    City poznan = new City("Poznań");

    public Map<City, List<City>> getFlights(){
        Map<City, List<City>> flights = new HashMap<>();
        List<City> warsawFlights = Arrays.asList(krakow, wroclaw, gdansk);
        List<City> krakowFlights = Arrays.asList(wroclaw, gdansk, katowice);
        List<City> wroclawFlights = Arrays.asList(gdansk, katowice, poznan);
        List<City> gdanskFlights = Arrays.asList(katowice, poznan, warsaw);
        flights.put(warsaw, warsawFlights);
        flights.put(krakow, krakowFlights);
        flights.put(wroclaw, wroclawFlights);
        flights.put(gdansk, gdanskFlights);
        return flights;
    }
}
