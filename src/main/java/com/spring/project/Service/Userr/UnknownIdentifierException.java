package com.spring.project.Service.Userr;

public class UnknownIdentifierException extends Exception {
    public UnknownIdentifierException() {
        super();
    }


    public UnknownIdentifierException(String message) {
        super(message);
    }


    public UnknownIdentifierException(String message, Throwable cause) {
        super(message, cause);
    }
}
