package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {

        //Given
        //create countries
        Country poland = new Country("Poland", new BigDecimal("38476269"));
        Country italy = new Country("Italy", new BigDecimal("62137802"));
        Country china = new Country("China", new BigDecimal("1379302771"));
        Country usa = new Country("United States of America", new BigDecimal("325625791"));
        //create continents
        Continent continentEurope = new Continent("Europe");
        Continent continentAsia = new Continent("Asia");
        Continent continentNorthAmerica = new Continent("North America");
        //add countries to countries
        continentEurope.addCountry(poland);
        continentEurope.addCountry(italy);
        continentAsia.addCountry(china);
        continentNorthAmerica.addCountry(usa);

        //create the world
        World world = new World();
        world.addContinent(continentEurope);
        world.addContinent(continentAsia);
        world.addContinent(continentNorthAmerica);

        //When
        BigDecimal totalPeopleQuantity = BigDecimal.ZERO;
        totalPeopleQuantity = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeopleQuantity = BigDecimal.ZERO;
        expectedPeopleQuantity = expectedPeopleQuantity.add(poland.getPeopleQuantity());
        expectedPeopleQuantity = expectedPeopleQuantity.add(italy.getPeopleQuantity());
        expectedPeopleQuantity = expectedPeopleQuantity.add(china.getPeopleQuantity());
        expectedPeopleQuantity = expectedPeopleQuantity.add(usa.getPeopleQuantity());

        Assert.assertEquals(expectedPeopleQuantity, totalPeopleQuantity);
    }
}
