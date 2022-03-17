package com.company;

public class UserNotFoundException extends Exception{
    UserNotFoundException(String message) {
        super(message);
    }
}
