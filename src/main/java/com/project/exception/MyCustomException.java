package com.project.exception;

public class MyCustomException extends RuntimeException{
    public MyCustomException() {

        super("This operations is not possible");
    }
}
