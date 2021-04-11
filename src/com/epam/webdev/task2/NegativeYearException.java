package com.epam.webdev.task2;

public class NegativeYearException extends Exception {
    public NegativeYearException(){
        super("Input year can not be negative.");
    }

    public NegativeYearException(String message) {
        super(message);
    }

    public NegativeYearException(String message, Throwable cause) {
        super(message, cause);
    }

    public NegativeYearException(Throwable cause) {
        super(cause);
    }
}
