package com.epam.webdev.task5;

public class PerfectNumberProcessor {

    public static boolean isNumberPerfect(int inputNumber) {

        int sumOfDividers = 0;

        for (int i = 1; i < inputNumber; i++) {
            if (inputNumber % i == 0) {
                sumOfDividers += i;
            }
        }

        return sumOfDividers == inputNumber;
    }
}
