package com.example.hallo22.beans;


import com.example.hallo22.model.Todo;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

/*
Beanklassen:  Named vorher @ManagedBean (JEE) , Bei Spring @Component
 Bean-Klassen werden automatisch instanziiert
 und haben einen Namen: helloBean

 */
@Named
@ViewScoped
public class TodoBean {


    private Todo tmpTodo = new Todo();
    private List<Todo> todolist = new ArrayList<>();


    public Todo.Prio[] getPrios(){
        return Todo.Prio.values();
    }

    @PostConstruct
    public void init(){

    }


    public Todo getTmpTodo() {
        return tmpTodo;
    }

    public void setTmpTodo(Todo tmpTodo) {
        this.tmpTodo = tmpTodo;
    }

    public void save(){// ActionListener
        System.out.println("TodoBean.save...");

        // um nicht nur Referenzen zu speichern, neue Objete erzeugen
        Todo t = new Todo(tmpTodo.getEntry(), tmpTodo.getPriority(), tmpTodo.getDeadline());

        todolist.add(t);


    }

    public List<Todo> getTodolist() {
        return todolist;
    }
}
