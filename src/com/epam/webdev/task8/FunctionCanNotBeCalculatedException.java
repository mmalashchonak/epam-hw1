package com.epam.webdev.task8;

public class FunctionCanNotBeCalculatedException extends Exception {
    public FunctionCanNotBeCalculatedException(){
        super("Roots can not be found because of dividing by 0.");
    }
}
