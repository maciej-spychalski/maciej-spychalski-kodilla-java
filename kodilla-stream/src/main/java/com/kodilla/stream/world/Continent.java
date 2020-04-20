package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public class Continent {
    private final String continentName;
    private final Set<Country> Countries = new HashSet<>();

    public Continent (final String continentName, final Set<Country> Countries) {
        this.continentName = continentName;
        this.Countries.addAll(Countries);
    }

    public String getContinentName() {
        return continentName;
    }

    public Set<Country> getCountries() {
        return Countries;
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