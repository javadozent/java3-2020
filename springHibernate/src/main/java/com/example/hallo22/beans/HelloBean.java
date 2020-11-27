package com.example.hallo22.beans;


import com.example.hallo22.model.Priority;
import com.example.hallo22.model.Todo;
import com.example.hallo22.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.ejb.PostActivate;
import javax.faces.event.ActionEvent;
import javax.inject.Named;
import java.time.LocalDate;

/*
Beanklassen:  Named vorher @ManagedBean (JEE) , Bei Spring @Component
 Bean-Klassen werden automatisch instanziiert
 und haben einen Namen: helloBean

 */
@Named
public class HelloBean {
    Todo todo = new Todo();

    @Autowired
    private TodoService service;
    @PostConstruct
    public void init(){

    }

    public Todo getTodo() {
        return todo;
    }

    public void setTodo(Todo todo) {
        this.todo = todo;
    }

    public void save(ActionEvent actionEvent) {
        Todo t =service.save(new Todo("abwaschen", LocalDate.now(),true, Priority.HIGH));

    }
}
