package com.epam.webdev.task3;

public class IncorrectLengthException extends Exception {
    public IncorrectLengthException(){
        super("Input year can not be negative.");
    }

    public IncorrectLengthException(String message) {
        super(message);
    }

    public IncorrectLengthException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectLengthException(Throwable cause) {
        super(cause);
    }
}
