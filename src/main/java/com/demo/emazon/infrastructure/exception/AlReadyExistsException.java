package com.demo.emazon.infrastructure.exception;

public class AlReadyExistsException extends RuntimeException{
    public AlReadyExistsException(String message){
        super(message);
    }
}
