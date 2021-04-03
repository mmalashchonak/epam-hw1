package com.epam.webdev.task2;

public class NegativeYearException extends Exception {
    public NegativeYearException(){
        super("Input year can not be negative.");
    }
}
