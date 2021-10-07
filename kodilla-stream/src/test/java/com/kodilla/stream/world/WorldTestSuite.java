package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        Country poland = new Country(new BigDecimal("37950000"));
        Country germany = new Country(new BigDecimal("83240000"));
        Country france = new Country(new BigDecimal("67390000"));
        Country egypt = new Country(new BigDecimal("10230000"));
        Country kenia = new Country(new BigDecimal("53770000"));
        Country tanzania = new Country(new BigDecimal("59730000"));
        Country china = new Country(new BigDecimal("1402000000"));
        Country india = new Country(new BigDecimal("1380000000"));
        Country japan = new Country(new BigDecimal("12580000"));
        Set<Country> europeCountries = new HashSet<>();
        europeCountries.add(poland);
        europeCountries.add(germany);
        europeCountries.add(france);
        Set<Country> africaCountries = new HashSet<>();
        africaCountries.add(egypt);
        africaCountries.add(kenia);
        africaCountries.add(tanzania);
        Set<Country> asiaCountries = new HashSet<>();
        asiaCountries.add(china);
        asiaCountries.add(india);
        asiaCountries.add(japan);
        Continent europe = new Continent(europeCountries);
        Continent africa = new Continent(africaCountries);
        Continent asia = new Continent(asiaCountries);
        Set<Continent> continents = new HashSet<>();
        continents.add(europe);
        continents.add(africa);
        continents.add(asia);
        World world = new World(continents);

        //When
        BigDecimal people = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeople = new BigDecimal("3106890000");
        Assert.assertEquals(expectedPeople, people);
    }
}
