package com.example.hallo22.model;

import java.time.LocalDate;

public class Todo{


    //TODO enum modifizieren
    public enum Prio{// name() == Name, ordinal() == Zahl/Inde
        HIGH, MIDDLE,LOW;

    }

    private int id;
    private String entry;
    private Prio priority;
    private LocalDate deadline;
    private boolean done;




    public Todo(){

    }

    public Todo(String entry, Prio priority, LocalDate deadline) {
        this.entry = entry;
        this.priority = priority;
        this.deadline = deadline;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    public Prio getPriority() {
        return priority;
    }

    public void setPriority(Prio priority) {
        this.priority = priority;
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

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", entry='" + entry + '\'' +
                ", priority=" + priority +
                ", deadline=" + deadline +
                ", done=" + done +
                '}';
    }
}
