package com.kodilla.good.patterns.challenges.flightoperator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Airports {
    private Map<String, Set<Flight>> allFlight = new HashMap<>();

    public Airports() {
        // Loty z Warszawy
        Set<Flight> warszawa = new HashSet<>();
        warszawa.add(new Flight("Warszawa", "Gdansk"));
        warszawa.add(new Flight("Warszawa", "Poznan"));
        warszawa.add(new Flight("Warszawa", "Rzeszow"));
        warszawa.add(new Flight("Warszawa", "Szczecin"));
        warszawa.add(new Flight("Warszawa", "Krakow"));
        warszawa.add(new Flight("Warszawa", "Wroclaw"));
        // Loty z Gdanska
        Set<Flight> gdansk = new HashSet<>();
        gdansk.add(new Flight("Gdansk", "Warszawa"));
        gdansk.add(new Flight("Gdansk", "Poznan"));
        gdansk.add(new Flight("Gdansk", "Krakow"));
        gdansk.add(new Flight("Gdansk", "Wroclaw"));
        // Loty z Poznania
        Set<Flight> poznan = new HashSet<>();
        poznan.add(new Flight("Poznan", "Warszawa"));
        poznan.add(new Flight("Poznan", "Krakow"));
        poznan.add(new Flight("Poznan", "Gdansk"));
        // Loty z Rzeszow
        Set<Flight> rzeszow = new HashSet<>();
        rzeszow.add(new Flight("Rzeszow", "Warszawa"));
        rzeszow.add(new Flight("Rzeszow", "Krakow"));
        // Loty z Szczecin
        Set<Flight> szczecin = new HashSet<>();
        szczecin.add(new Flight("Szczecin", "Warszawa"));
        szczecin.add(new Flight("Szczecin", "Krakow"));
        // Loty z Krakow
        Set<Flight> krakow = new HashSet<>();
        krakow.add(new Flight("Krakow", "Warszawa"));
        krakow.add(new Flight("Krakow", "Wrocław"));
        krakow.add(new Flight("Krakow", "Gdansk"));
        krakow.add(new Flight("Krakow", "Szczecin"));
        krakow.add(new Flight("Krakow", "Rzeszow"));
        // Loty z Wrocław
        Set<Flight> wroclaw = new HashSet<>();
        wroclaw.add(new Flight("Wroclaw", "Warszawa"));
        wroclaw.add(new Flight("Wroclaw", "Gdansk"));
        wroclaw.add(new Flight("Wroclaw", "Krakow"));
        // Loty z Radom
        Set<Flight> radom = new HashSet<>();
        radom.add(new Flight("Radom", "San Escobar"));
        radom.add(new Flight("Radom", "CPK"));
        radom.add(new Flight("Radom", "Egypt Londek"));
        // Loty z CPK
        Set<Flight> cpk = new HashSet<>();
        cpk.add(new Flight("CPK", "Rzeszow"));
        cpk.add(new Flight("CPK", "Beijing"));
        cpk.add(new Flight("CPK", "Szanghaj"));

        allFlight.put("Warszawa", warszawa);
        allFlight.put("Gdansk", gdansk);
        allFlight.put("Poznan", poznan);
        allFlight.put("Wroclaw", wroclaw);
        allFlight.put("Rzeszow", rzeszow);
        allFlight.put("Szczecin", szczecin);
        allFlight.put("Krakow", krakow);
        allFlight.put("Radom", radom);
        allFlight.put("CPK", cpk);

        System.out.println(allFlight.isEmpty());
    }

    public Map<String, Set<Flight>> getAllFlight() {
        return allFlight;
    }
}
