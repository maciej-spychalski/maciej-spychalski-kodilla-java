package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private final String countryName;
    private final BigDecimal numberOfPeople;

    public Country(final String countryName, final BigDecimal numberOfPeople) {
        this.countryName = countryName;
        this.numberOfPeople = numberOfPeople;
    }

    public BigDecimal getPeopleQuantity() {
        return numberOfPeople;
    }

    public String getCountryName() {
        return countryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return countryName.equals(country.countryName);
    }

    @Override
    public int hashCode() {
        return countryName.hashCode();
    }
}