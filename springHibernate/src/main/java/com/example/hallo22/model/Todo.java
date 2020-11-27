package com.example.hallo22.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Todo {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String entry;
    private LocalDate deadline;
    private boolean done;
    private Priority priority;

    public Todo(String entry, LocalDate deadline, boolean done, Priority priority) {
        this.entry = entry;
        this.deadline = deadline;
        this.done = done;
        this.priority = priority;
    }

    public Todo() {

    }

    public void setId(int id) {
        this.id = id;
    }


    public int getId() {
        return id;
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", entry='" + entry + '\'' +
                ", deadline=" + deadline +
                ", done=" + done +
                ", priority=" + priority +
                '}';
    }
}
