package com.epam.webdev.task4;

public class EvenChecker {

    public static final int MAX_NUMBER_OF_EVEN_NUMBERS = 2;

    public static boolean checkIfTwoEvenNumbers(int a, int b, int c, int d) {
        int[] inputArray = {a, b, c, d};

        int evenCount = 0;

        for (int i : inputArray) {
            if (i % 2 == 0) {
                evenCount++;
            }

            if(evenCount >= MAX_NUMBER_OF_EVEN_NUMBERS) {
                return true;
            }
        }

        return false;
    }
}
