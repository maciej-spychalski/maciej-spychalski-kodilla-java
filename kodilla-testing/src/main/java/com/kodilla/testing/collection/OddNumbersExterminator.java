package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    static ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> rightNumber = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                rightNumber.add(numbers.get(i));
            }
        }
        return rightNumber;
    }
}
