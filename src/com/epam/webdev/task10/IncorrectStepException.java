package com.epam.webdev.task10;

public class IncorrectStepException extends Exception {
    public IncorrectStepException(){
        super("Step can not be negative or zero.");
    }

    public IncorrectStepException(String message) {
        super(message);
    }

    public IncorrectStepException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectStepException(Throwable cause) {
        super(cause);
    }
}
