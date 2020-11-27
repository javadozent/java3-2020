package com.example.hallo22.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Person implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//GenerationType.AUTO
    private int id;
    private String firstname;
    private String lastname;


    //@see model.Todo
    @OneToMany(mappedBy="person", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Todo> todolist = new ArrayList<>();


    public Person(){

    }

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    public List<Todo> getTodolist() {
        return todolist;
    }

    public void setTodolist(List<Todo> todolist) {
        this.todolist = todolist;
    }

    public void addTodo(Todo t){
        t.setPerson(this);
        this.todolist.add(t);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", todolist=" + todolist +
                '}';
    }
}
