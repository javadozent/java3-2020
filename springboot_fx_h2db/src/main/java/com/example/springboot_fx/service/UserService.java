package com.example.springboot_fx.service;


import com.example.springboot_fx.controller.model.User;
import com.example.springboot_fx.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserDAO dao;

    @Autowired
    public UserService(UserDAO dao) {
        this.dao = dao;
    }

    public User save(User max) {
       return dao.save(max);
    }

    public List<User> getAll(){
        return dao.findAll();
    }


}
