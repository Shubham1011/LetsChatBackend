package com.shubham.letschatbackend.Repos;

import com.shubham.letschatbackend.model.Message;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends MongoRepository<Message,String> {

}
