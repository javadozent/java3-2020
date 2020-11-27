package com.example.mongodb.repository;


import com.example.mongodb.document.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends MongoRepository<User,Integer> {
}
