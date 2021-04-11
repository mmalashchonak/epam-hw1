package com.epam.webdev.task7;

public class SameDistanceException extends Exception {
    public SameDistanceException(String s) {
    }

    public SameDistanceException() {
        super();
    }

    public SameDistanceException(String message, Throwable cause) {
        super(message, cause);
    }

    public SameDistanceException(Throwable cause) {
        super(cause);
    }
}
