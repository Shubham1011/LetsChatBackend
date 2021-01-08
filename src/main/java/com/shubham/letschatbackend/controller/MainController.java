package com.shubham.letschatbackend.controller;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pusher.rest.Pusher;
import com.pusher.rest.data.Validity;
import com.shubham.letschatbackend.Repos.MessageRepository;
import com.shubham.letschatbackend.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin
public class MainController {

    @Autowired
    MessageRepository messageRepository;

    @Autowired
    Pusher pusher;


    @PostMapping("add")
public Message addMessage(@RequestBody Message message){

        Message message1= messageRepository.save(message);
        if(message1!=null){
         pusher.trigger("chat","addMessage",message1);

         return message1;
        }
        return null;
}

    @GetMapping("get")
    public List<Message> getMessage(){

        return messageRepository.findAll();

    }

}
