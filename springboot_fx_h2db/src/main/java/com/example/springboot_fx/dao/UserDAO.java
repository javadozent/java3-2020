package com.example.springboot_fx.dao;

import com.example.springboot_fx.controller.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User, Integer> {
}
