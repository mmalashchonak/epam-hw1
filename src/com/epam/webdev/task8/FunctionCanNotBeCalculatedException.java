package com.epam.webdev.task8;

public class FunctionCanNotBeCalculatedException extends Exception {
    public FunctionCanNotBeCalculatedException(){
        super("Roots can not be found because of dividing by 0.");
    }

    public FunctionCanNotBeCalculatedException(String message) {
        super(message);
    }

    public FunctionCanNotBeCalculatedException(String message, Throwable cause) {
        super(message, cause);
    }

    public FunctionCanNotBeCalculatedException(Throwable cause) {
        super(cause);
    }
}
