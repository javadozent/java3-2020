package com.example.hallo22.service;

import com.example.hallo22.dao.TodoDAO;
import com.example.hallo22.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    private TodoDAO todoDAO;

    public List<Todo> list() {
        return todoDAO.findAll();
    }

    public Todo save(Todo t) {
        return todoDAO.save(t);
    }

    public Todo find(int id) {
        return todoDAO.findById(id);
    }

    // update
    public Todo setTodoDone(int id) {
        Todo t = todoDAO.findById(id);
        t.setDone(true);
        return todoDAO.save(t);
    }

    public void delete(Todo t){
         todoDAO.delete(t);
    }
}
