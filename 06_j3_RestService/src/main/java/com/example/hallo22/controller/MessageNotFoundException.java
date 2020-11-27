package com.example.hallo22.controller;



import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


public class MessageNotFoundException extends RuntimeException {
    public MessageNotFoundException(String s) {
        super(s);
    }
}
