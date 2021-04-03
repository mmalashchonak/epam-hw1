package com.epam.webdev.task6;

public class NegativeTimeException extends Exception {
    public NegativeTimeException(){
        super("Input time can not be negative.");
    }
}
