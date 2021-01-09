package com.shubham.letschatbackend.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;

@Component
@Getter
@Setter
@Document
public class Message {

    @MongoId
    private  String id;
    private String name;
    private String message;
    private String timeStamp;
    private boolean received;
    private String room;


}
