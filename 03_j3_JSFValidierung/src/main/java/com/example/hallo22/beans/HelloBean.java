package com.example.hallo22.beans;


import org.springframework.stereotype.Component;

import javax.inject.Named;
import javax.validation.constraints.NotNull;

/*
Beanklassen:  Named vorher @ManagedBean (JEE) , Bei Spring @Component
 Bean-Klassen werden automatisch instanziiert
 und haben einen Namen: helloBean

 */
@Named
public class HelloBean {


    private String message ="Nachricht vom Bean";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
