package com.kodilla.good.patterns.challenges.flightoperator;

public class Application {
    public static void main(String[] args) {

        FlightService flightService = new FlightService();

        flightService.findAllFlightsFrom("Warszawa");
        flightService.findAllFlightsTo("Krakow");
        flightService.findAllIndirectFlight(new Flight("Gdansk", "Warszawa"));

    }
}
