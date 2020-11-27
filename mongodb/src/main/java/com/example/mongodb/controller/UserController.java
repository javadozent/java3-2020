package com.example.mongodb.controller;


import com.example.mongodb.document.User;
import com.example.mongodb.service.MongoDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users/")
public class UserController {


    @Autowired
    private MongoDBService mongoDBService;

    @GetMapping("/all")
    public List<User> getAll(){
        return mongoDBService.getUsers();
    }

    @PostMapping("/save")
    public User save(@RequestBody User user) {
        return mongoDBService.saveUser(user);
    }

}
