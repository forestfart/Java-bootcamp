package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public final class Continent {
    private final String continentName;
    private final Set<PeopleStorage> countries = new HashSet<>();

    public Continent(final String continentName) {
        this.continentName = continentName;
    }

    public void addCountry (Country country) { countries.add(country); }

    public Set<PeopleStorage> getCountries() {
        return countries;
    }
}
