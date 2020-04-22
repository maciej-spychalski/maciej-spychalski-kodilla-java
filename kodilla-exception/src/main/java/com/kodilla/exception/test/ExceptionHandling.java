package com.kodilla.exception.test;

public class ExceptionHandling {
    SecondChallenge secondChallenge = new SecondChallenge();

    try {
        String s = secondChallenge.probablyIWillThrowException(1.0, 1.5);
        System.out.println(s);
    } catch (Exception e) {
        System.out.println("x should be in range <1,2) and y cannot be equal 1.5");
    }
}
