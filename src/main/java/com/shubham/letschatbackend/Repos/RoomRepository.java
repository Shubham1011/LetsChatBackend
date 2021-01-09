package com.shubham.letschatbackend.Repos;

import com.shubham.letschatbackend.model.Room;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoomRepository extends MongoRepository<Room,String> {
}
