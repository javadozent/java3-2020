package com.example.todo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication {


    static Logger log = LogManager.getLogger() ;
    public static void main(String[] args) {

        log.info("App start...");
        SpringApplication.run(TodoApplication.class, args);
    }

}
