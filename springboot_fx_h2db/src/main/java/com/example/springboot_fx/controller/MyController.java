package com.example.springboot_fx.controller;


import com.example.springboot_fx.controller.model.User;
import com.example.springboot_fx.service.UserService;
import javafx.application.Platform;
import javafx.event.ActionEvent;

import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import net.rgielen.fxweaver.core.FxmlView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


/**
 * no @FXML Annotation!!!
 */
@Component
@FxmlView("MainView.fxml")
public class MyController {

    private UserService userService;
    public TextField textField;
    public ListView<User> listView;


    void initialize() {

        listView.getItems().setAll(userService.getAll());
    }

    @Autowired
    public MyController(UserService weatherService) {
        this.userService = weatherService;
    }

    public void onSave(ActionEvent actionEvent) {
        //System.out.println(textField.getText());
        User u = userService.save(new User(textField.getText()));
        System.out.println(u);
        if (u != null) {
            listView.getItems().setAll(userService.getAll());
            textField.clear();

        }
    }
}
