package com.epam.webdev.task6;

public class NegativeTimeException extends Exception {
    public NegativeTimeException(){
        super("Input time can not be negative.");
    }

    public NegativeTimeException(String message) {
        super(message);
    }

    public NegativeTimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public NegativeTimeException(Throwable cause) {
        super(cause);
    }
}
