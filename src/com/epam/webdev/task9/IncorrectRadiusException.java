package com.epam.webdev.task9;

public class IncorrectRadiusException extends Exception {
    public IncorrectRadiusException(){
        super("Input radius can not be negative or zero.");
    }

    public IncorrectRadiusException(String message) {
        super(message);
    }

    public IncorrectRadiusException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectRadiusException(Throwable cause) {
        super(cause);
    }
}
