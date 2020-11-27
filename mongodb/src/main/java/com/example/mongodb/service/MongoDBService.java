package com.example.mongodb.service;




import com.example.mongodb.document.User;

import java.util.List;

public interface MongoDBService {

    public List<User> getUsers();
    public User saveUser(User user);
}
