package com.epam.webdev.task9;

public class IncorrectRadiusException extends Exception {
    public IncorrectRadiusException(){
        super("Input radius can not be negative or zero.");
    }
}
