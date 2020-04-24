package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearcher {
    final Map<String, Boolean> mapOfFlights;

    public FlightSearcher() {
        mapOfFlights = new HashMap<>();
    }

    public void setAvailableFlights() {

        mapOfFlights.put("Warsaw Chopin Airport", false);
        mapOfFlights.put("Berlin Brandenburg Internantiona Airport", false);
        mapOfFlights.put("London Heatrow Airport", true);
        mapOfFlights.put("John F. Kennedy International Airport", true);
    }

    public void findFilght(Flight flight) throws RouteNotFoundException {

        long possibleFlight = 0;
        possibleFlight = mapOfFlights.entrySet().stream()
                .filter(airport -> flight.getArrivalAirport().equals(airport.getKey()))
                .count();

        if (possibleFlight == 1) {
            System.out.print("Destination airport is available. ");
            if (mapOfFlights.get(flight.getArrivalAirport())) {
                System.out.println("Have a nice flight");
            } else {
                System.out.println("There is currently no flight to this airport");
            }
        } else {
            throw new RouteNotFoundException("There is no such an destination airport");
        }

    }
}
