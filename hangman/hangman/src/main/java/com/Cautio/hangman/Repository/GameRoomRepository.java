package com.Cautio.hangman.Repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Cautio.hangman.Model.GameRoom;

@Repository
public interface GameRoomRepository  extends MongoRepository<GameRoom,String>{
          Optional<GameRoom>findByRoomId(String roomId); 
                               
}
