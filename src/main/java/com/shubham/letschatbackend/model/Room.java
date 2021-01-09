package com.shubham.letschatbackend.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Getter
@Setter
@Document
public class Room {
    @MongoId
    private String id;
    private String name;

}
