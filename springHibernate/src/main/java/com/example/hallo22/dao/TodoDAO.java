package com.example.hallo22.dao;

import com.example.hallo22.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoDAO extends JpaRepository<Todo,Long> {

    Todo findById(int id);
}
