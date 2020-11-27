package com.example.hallo22.service;

import com.example.hallo22.model.Priority;
import com.example.hallo22.model.Todo;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest

public class TodoServiceTest {
    @Autowired
    private TodoService todoService;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test

    void list() {
        List<Todo> list = todoService.list();

        assertEquals(list.size(), 2);
    }

    @Test

    void save() {
        Todo t =todoService.save(new Todo("abwaschen", LocalDate.now(),true, Priority.HIGH));
        assertNotNull(t);

        System.out.println(todoService.list().size());
        List<Todo> list = todoService.list();
        assertEquals(list.size(), 3);
    }


    @Test

    void find() {
        Todo t = todoService.find(1);
        System.out.println(t);
        assertNotNull(t);
    }


    @Test

    void setTodoDone() {
       Todo t = todoService.setTodoDone(1);
        System.out.println(t);
        assertTrue(t.isDone());


    }

    @Test

    void delete() {
        Todo t =todoService.save(new Todo("xxx", LocalDate.now(),true, Priority.HIGH));
        Todo t2 =todoService.find(t.getId());
        todoService.delete(t2);
        System.out.println(">>>"+t2);
        System.out.println("<<<"+todoService.find(t2.getId()));

    }
}