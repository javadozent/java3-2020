package com.example.hallo22.service;

import com.example.hallo22.model.Prio;
import com.example.hallo22.model.Todo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class TodoServiceTest {

    @Autowired
    private TodoService service;

    @Test
    void list() {
       List<Todo> list =  service.list();
       assertEquals(list.size(), 2);

    }

    @Test  //    public Todo(String entry, boolean done, LocalDate deadline, Prio prio) {
    void save() {
       Todo t = service.save(new Todo( "abwaschen", false, LocalDate.now(), Prio.HIGH));
        System.out.println(t);
       assertNotNull(t);
    }


    @Test
    void find() {
      Todo t =  service.find(1);
      assertNotNull(t);

    }

    @Test
    void updateDone() {
        Todo t =service.updateDone(1);
        assertTrue(t.isDone());
        System.out.println("update:"+t);
    }

    @Test
    void delete() {

        Todo  t = service.save(new Todo("xxx",false,LocalDate.now(),Prio.HIGH));
        Todo dt = service.find(t.getId());
        service.delete(dt);
        System.out.println(">>>"+dt);
        System.out.println(">>>"+service.find(dt.getId()));
        assertNull(service.find(dt.getId()));

    }
}