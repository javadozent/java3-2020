package com.example.springboot_fx.service;

import com.example.springboot_fx.controller.model.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Id;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    @Autowired
    private UserService userService;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void save() {

        User u=  userService.save(new User("Max"));
        assertNotNull(u);
    }
}