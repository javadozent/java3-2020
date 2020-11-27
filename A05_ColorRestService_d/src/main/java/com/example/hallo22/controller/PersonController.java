package com.example.hallo22.controller;


import com.example.hallo22.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/persons")

public class PersonController {


    List<Person> findAll(){

    }
}
