package org.example.homework160224;

public class IncorrectBookNameException extends RuntimeException{
    public IncorrectBookNameException(String message) {
        super(message);
    }
}