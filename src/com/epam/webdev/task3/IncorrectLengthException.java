package com.epam.webdev.task3;

public class IncorrectLengthException extends Exception {
    public IncorrectLengthException(){
        super("Input year can not be negative.");
    }
}
