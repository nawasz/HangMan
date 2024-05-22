// package com.Cautio.hangman.service;

// import java.util.List;
// import java.util.Optional;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.Cautio.hangman.Model.GameRoom;
// import com.Cautio.hangman.Model.UserEntity;
// import com.Cautio.hangman.Repository.GameRoomRepository;
// import com.Cautio.hangman.Repository.UserRepository;

// // @Service
// public class GameRoomService {

//     @Autowired
//     private GameRoomRepository gameRoomRepository;

//     @Autowired
//     private UserRepository userRepository;

//     public  GameRoom createGameRoom(String hostUserName){
//         UserEntity UserOpl  =userRepository.findByUsername(hostUserName).orElseThrow(()-> new IllegalArgumentException("User not found"));
//         GameRoom gameRoom  =  new   GameRoom(UserOpl);
//         return gameRoomRepository.save(gameRoom);
//     }   
//     public Optional<GameRoom> joinGameRoom(String roomId, String playerUsername) {
//           Optional<GameRoom> gameRoomOpt = gameRoomRepository.findByRoomId(roomId);
//           if (gameRoomOpt.isPresent()) {
//               GameRoom gameRoom = gameRoomOpt.get();
//               UserEntity player = userRepository.findByUsername(playerUsername)
//                       .orElseThrow(() -> new IllegalArgumentException("User not found"));
//               gameRoom.getPlayers().add(player);
//               gameRoomRepository.save(gameRoom);
//           }
//           return gameRoomOpt;   
// }
// public void startGame(String roomId, String word) {
//     try{
//         List<GameRoom>  gameRooms =gameRoomRepository.findAll();
//         gameRooms.stream().forEach((game)->{
//                 System.out.println(game.getRoomId());
//         });
// Optional<GameRoom> gameRoomOptional = gameRoomRepository.findByRoomId(roomId);
// if (gameRoomOptional.isPresent()) {
// GameRoom gameRoom = gameRoomOptional.get();
// gameRoom.startNewGame(word);
// gameRoomRepository.save(gameRoom);
// }
// }catch(Exception e){
//       System.out.println(e);
//       System.out.println("line "+ e.getCause());
// }
      
// }
// public boolean makeGuess(String roomId, char letter) {
//     Optional<GameRoom> gameRoomOptional = gameRoomRepository.findById(roomId);
//     if (gameRoomOptional.isPresent()) {
//         GameRoom gameRoom = gameRoomOptional.get();
//         boolean correct = gameRoom.getGame().guessLetter(letter);
//         gameRoomRepository.save(gameRoom);
//         return correct;
//     }
//     return false;
// }
// }