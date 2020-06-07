package com.kodilla.good.patterns.challenges.flightoperator;

import java.util.Set;
import java.util.stream.Collectors;

public class FlightService {
    private Airports airports;

    public FlightService() {
        airports = new Airports();
    }

    public void findAllFlightsFrom(String departureCity) {
        System.out.println();
        System.out.println("All flights to: " + departureCity);
        airports.getAllFlight().get(departureCity).stream()
                .forEach(System.out::println);
    }

    public void findAllFlightsTo(String destinationCity) {
        System.out.println();
        System.out.println("All flights to: " + destinationCity);
        airports.getAllFlight().entrySet().stream()
                .map(entry -> entry.getValue())
                .flatMap(f ->f.stream())
                .filter(f -> f.getTo().equals(destinationCity))
                .forEach(System.out::println);
    }

    public void findAllIndirectFlight(Flight flight) {
        System.out.println();
        System.out.println("All indirect flights from " + flight.getFrom() + " to " + flight.getTo());
        Set<Flight> flightFrom =  airports.getAllFlight().get(flight.getFrom());

        Set<Flight> flightVia =  airports.getAllFlight().entrySet().stream()
                .map(entry -> entry.getValue())
                .flatMap(f ->f.stream())
                .filter(f -> f.getTo().equals(flight.getTo()))
                .collect(Collectors.toSet());

        for(Flight theFlight : flightFrom) {
            flightVia.stream()
                    .filter(f -> f.getFrom().equals(theFlight.getTo()))
                    .map(f -> theFlight + " " + f.toString())
                    .forEach(System.out::println);
        }
    }

}
