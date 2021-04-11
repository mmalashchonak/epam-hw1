package com.epam.webdev.task3;

public class IncorrectAreaException extends Exception {
    public IncorrectAreaException(){
        super("Input area can not be negative or 0.");
    }

    public IncorrectAreaException(String message) {
        super(message);
    }

    public IncorrectAreaException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectAreaException(Throwable cause) {
        super(cause);
    }
}
