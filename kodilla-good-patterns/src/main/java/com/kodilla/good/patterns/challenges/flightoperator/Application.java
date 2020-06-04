package com.kodilla.good.patterns.challenges.flightoperator;

import java.util.*;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {

        Airports airports = new Airports();

        System.out.println();
        String departureCity = "Warszawa";
        System.out.println("All flights to: " + departureCity);
        airports.getAllFlight().get(departureCity).stream()
                .forEach(System.out::println);

        System.out.println();
        String destinationCity = "Krakow";
        System.out.println("All flights to: " + destinationCity);
        airports.getAllFlight().entrySet().stream()
                .map(entry -> entry.getValue())
                .flatMap(f ->f.stream())
                .filter(f -> f.getTo().equals(destinationCity))
                .forEach(System.out::println);

        System.out.println();
        Flight theFlight = new Flight("Gdansk", "Warszawa");
        System.out.println("All indirect flights from " + theFlight.getFrom() + " to " + theFlight.getTo());
        Set<Flight> flightFrom =  airports.getAllFlight().entrySet().stream()
                .map(entry -> entry.getValue())
                .flatMap(f ->f.stream())
                .filter(f -> f.getFrom().equals(theFlight.getFrom()))
                .collect(Collectors.toSet());
        flightFrom.remove(theFlight);

        Set<Flight> flightVia =  airports.getAllFlight().entrySet().stream()
                .map(entry -> entry.getValue())
                .flatMap(f ->f.stream())
                .filter(f -> f.getTo().equals(theFlight.getTo()))
                .collect(Collectors.toSet());

        for(Flight flight : flightFrom) {
            flightVia.stream()
                    .filter(f -> f.getFrom().equals(flight.getTo()))
                    .map(f -> flight + " " + f.toString())
                    .forEach(System.out::println);
        }
    }
}
