package com.example.springboot_fx;

import javafx.application.Application;
import net.rgielen.fxweaver.core.FxWeaver;
import net.rgielen.fxweaver.spring.SpringFxWeaver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootFxApplication {

    public static void main(String[] args) {
       // SpringApplication.run(SpringbootFxApplication.class, args);
        Application.launch(JavaFxApplication.class, args);
    }



}
