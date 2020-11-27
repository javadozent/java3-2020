package com.example.hallo22.controller;


import com.example.hallo22.model.Message;
import com.example.hallo22.service.MessageService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/messages")  //http://localhost:8080/messages
@RestController
public class MessageController {
    static Logger log = LogManager.getLogger() ;

    @Autowired
    MessageService service;


    /**
     * ist default -> /messages"
     * http://localhost:8080/messages
     * @return
     */
    @RequestMapping
    public List<Message> getAllMessages(){
        log.debug("find all...");

        return service.findAll();
    }
   @GetMapping("/{id}")
    public Message getMessageById(@PathVariable("id") int id){//-> http://localhost:8080/messages/2
       log.debug("************************ Log *******************************");
        Message m = service.findById(id);

        if(m==null){
            throw new MessageNotFoundException("Id nicht vorhanden "+id);
        }
        return m;
    }

    // 2. Variante als QueryParameter -> RequestParam
    @GetMapping
    public Message getMessageByIdQuery(@RequestParam(name ="id") int id){// http://localhost:8080/messages?id=2
        log.debug("************************ Log *******************************");
        Message m = service.findById(id);

        if(m==null){
            throw new MessageNotFoundException("Id nicht vorhanden "+id);
        }
        return m;
    }

    @PostMapping("/new-message")
    Message newEmployee(@RequestBody Message newMessage) {
        log.info("************************ Log *******************************");
        return service.save(newMessage);
    }


}
