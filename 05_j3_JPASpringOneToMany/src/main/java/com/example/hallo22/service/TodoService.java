package com.example.hallo22.service;


import com.example.hallo22.dao.TodoDAO;
import com.example.hallo22.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
Implementierungen, konkrete aufbereitete, Methoden,
- ksnn genauso wie DAO ein Interface sein
 */
@Service
public class TodoService {

    @Autowired  // erzeugt/holt Instanz, depndencyInjection- @Inject geht auch
    private TodoDAO dao;

    public List<Todo> list(){
        return dao.findAll();
    }

    public Todo save(Todo t){
        return dao.save(t);
    }

    public Todo find(int id){
        return dao.findById(id);
    }

    public Todo updateDone(int id){
        Todo t = dao.findById(id);
        t.setDone(true);
        return dao.save(t);
    }

    //TODO return boolean or Todo
    public void delete(Todo t ){
        dao.delete(t);
    }

}
