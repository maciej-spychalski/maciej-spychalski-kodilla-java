package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Set<Continent> continents = new HashSet<>();

        Set<Country> europe = new HashSet<>();
        europe.add(new Country("Russia", new BigDecimal("146877088")));
        europe.add(new Country("German", new BigDecimal("82370000")));
        europe.add(new Country("France", new BigDecimal("62151000")));
        europe.add(new Country("Great Britain", new BigDecimal("60944000")));
        europe.add(new Country("Italy", new BigDecimal("60944000")));
        continents.add(new Continent("Europe", europe));

        Set<Country> asia = new HashSet<>();
        asia.add(new Country("China", new BigDecimal("1306313813")));
        asia.add(new Country("India", new BigDecimal("1102358999")));
        asia.add(new Country("Indonesia", new BigDecimal("246973100")));
        asia.add(new Country("Pakistan", new BigDecimal("178801560")));
        asia.add(new Country("Vietnam", new BigDecimal("82689518")));
        continents.add(new Continent("Asia", asia));

        Set<Country> africa = new HashSet<>();
        africa.add(new Country("Egypt", new BigDecimal("82079636")));
        africa.add(new Country("Ethiopia", new BigDecimal("90873739")));
        africa.add(new Country("Nigeria", new BigDecimal("165822569")));
        africa.add(new Country("Democratic republic of Kongo", new BigDecimal("71712867")));
        africa.add(new Country("South Africa", new BigDecimal("49004031")));
        continents.add(new Continent("Afirca", africa));

        Set<Country> northAmerica = new HashSet<>();
        northAmerica.add(new Country("USA", new BigDecimal("308878120")));
        northAmerica.add(new Country("Mexico", new BigDecimal("107563903")));
        northAmerica.add(new Country("Canada", new BigDecimal("33989040")));
        northAmerica.add(new Country("Guatemala", new BigDecimal("15655188")));
        northAmerica.add(new Country("Cuba", new BigDecimal("13346676")));
        continents.add(new Continent("North America", northAmerica));

        Set<Country> southAmerica = new HashSet<>();
        southAmerica.add(new Country("Brazil", new BigDecimal("198739269")));
        southAmerica.add(new Country("Columbia", new BigDecimal("43677372")));
        southAmerica.add(new Country("Argentina", new BigDecimal("40913584")));
        southAmerica.add(new Country("Peru", new BigDecimal("29546963")));
        southAmerica.add(new Country("Venezuela", new BigDecimal("26814843")));
        continents.add(new Continent("South America", southAmerica));

        World world = new World(continents);

        //When
        BigDecimal numberOfPeopleInWorld = world.getPeopleQuantity();

        //Then
        BigDecimal expectedNumberOfPeopleInWorld = new BigDecimal("4609040878");
        Assert.assertEquals(expectedNumberOfPeopleInWorld, expectedNumberOfPeopleInWorld);
    }
}
