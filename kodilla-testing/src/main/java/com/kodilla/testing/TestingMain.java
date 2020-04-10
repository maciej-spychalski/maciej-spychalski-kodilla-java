package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        int reslutOfAddition = calculator.add(10,5);
        int reslutOfSubstraction = calculator.substract(10,5);

        if (reslutOfAddition == 10 + 5) {
            System.out.println("Test of additon: OK");
        } else {
            System.out.println("Test of additon: Error!");
        }

        if (reslutOfSubstraction == 10 - 5) {
            System.out.println("Test of substraction: OK");
        } else {
            System.out.println("Test of substraction: Error!");
        }
    }
}
