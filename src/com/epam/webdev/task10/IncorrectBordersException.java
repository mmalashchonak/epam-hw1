package com.epam.webdev.task10;

public class IncorrectBordersException extends Exception {
    public IncorrectBordersException(){
        super("Incorrect input borders");
    }

    public IncorrectBordersException(String message) {
        super(message);
    }

    public IncorrectBordersException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectBordersException(Throwable cause) {
        super(cause);
    }
}
