package com.example.mongodb.service;


import com.example.mongodb.document.User;
import com.example.mongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MongoDBServiceImpl implements  MongoDBService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
