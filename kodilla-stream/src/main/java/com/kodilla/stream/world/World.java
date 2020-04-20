package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;

import java.util.Set;

public class World {
    private final Set<Continent> continents = new HashSet<>();

    public World (final Set<Continent> continents) {
        this.continents.addAll(continents);
    }

    public BigDecimal getPeopleQuantity() {
        return continents.stream()
                .flatMap(country -> country.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }

}
