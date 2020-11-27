package com.example.mongodb;

import com.example.mongodb.document.User;
import com.example.mongodb.service.MongoDBService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class MongodbApplicationTests {


    @Autowired
    private MongoDBService mongoDBService;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void saveUser() {
        User user = mongoDBService.saveUser(new User(LocalDateTime.now().getNano(), "Max", "Müller", "tes@test.de"));
        assertNotNull(user);
    }
    @Test
    void getUsers() {
        List<User> users = mongoDBService.getUsers();
        System.out.println(users);


    }
}
