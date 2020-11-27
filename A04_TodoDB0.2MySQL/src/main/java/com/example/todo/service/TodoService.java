package com.example.todo.service;

import com.example.todo.dao.TodoDAO;
import com.example.todo.model.Todo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
Implementierungen, konkrete aufbereitete, Methoden,
- ksnn genauso wie DAO ein Interface sein
 */
@Service
public class TodoService {

    static Logger log = LogManager.getLogger() ;

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
    }//see DAO

    public Todo updateDone(int id){
        Todo t = dao.findById(id);
        boolean done = t.isDone()?false:true;
        t.setDone(done);
        return dao.save(t);
    }

    //TODO return boolean or Todo
    public void delete(Todo t ){
        dao.delete(t);
    }

}
