package com.epam.webdev.task1;

public class LastSquareDigitProcessor {

    public static int calcSquareLastDigit(double input) {
        String inputStr = String.valueOf(input);
        int lastDigit = Character.getNumericValue(inputStr.charAt(inputStr.length() - 1));
        int lastDigitSquared = lastDigit * lastDigit;
        int lastDigitOfNumberSquared = lastDigitSquared % 10;
        return lastDigitOfNumberSquared;
    }
}
