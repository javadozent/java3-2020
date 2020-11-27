package com.example.todo.dao;


import com.example.todo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



/*
DAO - enthält/erbt schon Standard-Methoden e.g. findAll
 */
@Repository
public interface TodoDAO extends JpaRepository<Todo, Long> {
    //Methoden original überschreiben,verändern, hinzufügen
    Todo findById(int id); // Original: Optional<T> findById(Long)



}
