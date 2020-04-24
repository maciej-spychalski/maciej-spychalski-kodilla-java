package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearcher {
    final Map<String, Boolean> mapOfFlights;

    public FlightSearcher() {
        mapOfFlights = new HashMap<>();

        mapOfFlights.put("Warsaw Chopin Airport", true);
        mapOfFlights.put("Berlin Brandenburg International Airport", false);
        mapOfFlights.put("London Heatrow Airport", true);
        mapOfFlights.put("John F. Kennedy International Airport", true);
    }

    public boolean findFilght(Flight flight) throws RouteNotFoundException {

        long possibleFlight = 0;
        possibleFlight = mapOfFlights.entrySet().stream()
                .filter(airport -> flight.getArrivalAirport().equals(airport.getKey()))
                .count();

        if (possibleFlight == 1) {
            System.out.print("\nDestination airport is available. ");
            if (mapOfFlights.get(flight.getArrivalAirport())) {
                System.out.println("Have a nice flight");
                return true;
            } else {
                System.out.println("There is currently no flight to this airport");
                return false;
            }
        } else {
            throw new RouteNotFoundException("\n\nThere is no such destination airport");
        }

    }
}
