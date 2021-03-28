package com.epam.webdev.task10;

public class IncorrectStepException extends Exception {
    public IncorrectStepException(){
        super("Step can not be negative or zero.");
    }
}
