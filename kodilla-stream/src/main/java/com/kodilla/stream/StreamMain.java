package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        String poem = "\nCzemu ty się, zła godzino,\n" +
                        "z niepotrzebnym mieszasz lękiem?\n" +
                        "Jesteś - a więc musisz minąć.\n" +
                        "Miniesz - a więc to jest piękne.\n";

        poemBeautifier.beautify(poem, (stringToDecorate) -> "****" + stringToDecorate + "***");
        poemBeautifier.beautify(poem, (stringToDecorate) ->  stringToDecorate.toUpperCase());
        poemBeautifier.beautify(poem, (stringToDecorate) ->  stringToDecorate.replace(' ', '\t'));
        poemBeautifier.beautify(poem, (stringToDecorate) ->
                "****" + stringToDecorate.replace(' ', '\n') + "***");

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

    }
}
