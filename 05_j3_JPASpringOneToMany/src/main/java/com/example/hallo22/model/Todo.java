package com.example.hallo22.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//GenerationType.AUTO
    private int id;
    private String entry;
    private boolean done;
    private LocalDate deadline;

    //@Column(name = "priority",length = 50)
    private Prio priority;



    @ManyToOne(cascade=CascadeType.ALL, optional = false,fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    public Todo() {
    }

    public Todo(String entry, boolean done, LocalDate deadline, Prio prio) {
        this.entry = entry;
        this.done = done;
        this.deadline = deadline;
        this.priority = prio;
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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public Prio getPriority() {
        return priority;
    }

    public void setPriority(Prio prio) {
        this.priority = prio;
    }



    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", entry='" + entry + '\'' +
                ", done=" + done +
                ", deadline=" + deadline +
                ", prio=" + priority +
                '}';
    }
}
