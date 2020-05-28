package com.kodilla.good.patterns.challenges;


import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        // Wykorzystując poznane już Streamy wykonaj iterację po poniższej mapie tytułów i wyświetl wszystkie tytuły
        // w jednym ciągu separując je wykrzyknikiem:

        MovieStore movieStore = new MovieStore();
        String theResultStringOfMovie = movieStore.getMovies().entrySet().stream()
                .map(entry -> entry.getValue())
                .flatMap(s -> s.stream())
                .collect(Collectors.joining("!","",""));
        System.out.println(theResultStringOfMovie);
    }
}
