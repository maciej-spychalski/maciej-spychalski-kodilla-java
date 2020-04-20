package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public class Continent {
    private final String continentName;
    private final Set<Country> countries = new HashSet<>();

    public Continent (final String continentName, final Set<Country> countries) {
        this.continentName = continentName;
        this.countries.addAll(countries);
    }

    public String getContinentName() {
        return continentName;
    }

    public Set<Country> getCountries() {
        return new HashSet<>(countries);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return continentName.equals(continent.continentName);
    }

    @Override
    public int hashCode() {
        return continentName.hashCode();
    }
}