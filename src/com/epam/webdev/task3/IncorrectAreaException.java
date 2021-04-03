package com.epam.webdev.task3;

public class IncorrectAreaException extends Exception {
    public IncorrectAreaException(){
        super("Input area can not be negative or 0.");
    }
}
