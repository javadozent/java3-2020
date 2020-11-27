package com.example.hallo22.service;



import com.example.hallo22.model.Message;

import java.util.List;

public interface MessageService {

    List<Message> findAll();

    Message findById(int id);

    Message save(Message newMessage);
}
