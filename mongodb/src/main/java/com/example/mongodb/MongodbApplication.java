package com.example.mongodb;

import com.example.mongodb.document.User;
import com.example.mongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class MongodbApplication {

    @Autowired

    private UserRepository userRepository;

    public static void main(String[] args) {


        SpringApplication.run(MongodbApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void afterStart() {
        userRepository.save(new User(1, "Max", "Müller", "tes@test.de"));
    }

}
