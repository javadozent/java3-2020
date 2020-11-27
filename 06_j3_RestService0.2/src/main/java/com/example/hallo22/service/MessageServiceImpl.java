package com.example.hallo22.service;


import com.example.hallo22.model.Message;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class MessageServiceImpl implements  MessageService{
    // List.of // Arrays.asList erzeugt imutable List
    private List<Message> list = List.of( new Message(1,"Hallo Rest") ,new Message(2,"Hallo Java"),new Message(3,"Hallo Welt") );

    @Override
    public List<Message> findAll() {
        return list;
    }

    @Override
    public Message findById(int id) {

      Optional<Message> o =list.stream().filter(e->e.getId() == id).findFirst();

      if(o.isEmpty()){
          return null;
      }
        return o.get();
    }

    @Override
    public Message save(Message newMessage) {
        //list.add(newMessage);
        return newMessage;
    }
}
