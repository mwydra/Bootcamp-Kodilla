package com.kodilla.good.patterns.SmallAirlines;

import java.util.Objects;

public class City {
    private String city;

    public City(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return city.equals(city1.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city);
    }
}
