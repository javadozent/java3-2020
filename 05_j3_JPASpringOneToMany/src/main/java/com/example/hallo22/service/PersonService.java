package com.example.hallo22.service;


import com.example.hallo22.dao.PersonDAO;
import com.example.hallo22.dao.TodoDAO;
import com.example.hallo22.model.Person;
import com.example.hallo22.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class PersonService {
    @Autowired  // erzeugt/holt Instanz, depndencyInjection- @Inject geht auch
    private PersonDAO personDAO;
    @Autowired  // erzeugt/holt Instanz, depndencyInjection- @Inject geht auch
    private TodoDAO todoDAO;

    public Person save(Person p){

       return personDAO.save(p);

    }

    public Person findById(int id){
        return personDAO.findById(id);
    }

}
