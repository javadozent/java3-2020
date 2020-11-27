package com.example.hallo22.dao;

import com.example.hallo22.model.Person;
import com.example.hallo22.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonDAO extends JpaRepository<Person, Long> {



    Person findById(int id);
}
