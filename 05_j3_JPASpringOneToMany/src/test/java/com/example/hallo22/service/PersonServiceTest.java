package com.example.hallo22.service;

import com.example.hallo22.model.Person;
import com.example.hallo22.model.Prio;
import com.example.hallo22.model.Todo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.event.annotation.BeforeTestClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PersonServiceTest {
    @Autowired
    private PersonService pService;

    @Autowired
    private TodoService tService;


    @BeforeEach
    void setUp() {

        Person p = new Person("Otto", "Krause");
        pService.save(p);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void newPersonTest() {
        Person p = new Person("Max", "Müller");
        Todo t1 = new Todo("xxx", false, LocalDate.now(), Prio.HIGH);
        Todo t2 = new Todo("yyy", false, LocalDate.now(), Prio.HIGH);


        p.addTodo(t1);
        p.addTodo(t2);
        assertNotNull(tService.save(t1));
        assertNotNull(tService.save(t2));


    }


    @Test
    void findPerson(){
        System.out.println(pService.findById(1));
    }


    /**
     * eine existierende Person bekommt neues Todo
     */
    @Test
    void attachTodo() {
        Person p = pService.findById(1);
        p.addTodo( new Todo("zzz", false, LocalDate.now(), Prio.HIGH));
        pService.save(p);// update
    }


}