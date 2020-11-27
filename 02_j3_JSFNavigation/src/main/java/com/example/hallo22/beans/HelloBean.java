package com.example.hallo22.beans;


import org.springframework.stereotype.Component;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

/*
Beanklassen:  Named vorher @ManagedBean (JEE) , Bei Spring @Component
 Bean-Klassen werden automatisch instanziiert
 und haben einen Namen: helloBean

 */
@Named
@ViewScoped
public class HelloBean {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public String login(){
        return  message;
    }
}
