package com.Cautio.hangman.service;
import java.util.HashMap;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.Cautio.hangman.Model.Game;
import com.Cautio.hangman.Model.GameRoom;
import com.Cautio.hangman.Model.UserEntity;
import com.Cautio.hangman.Repository.GameRoomRepository;




@Service
public class GameService{

  @Autowired
  GameRoomRepository gameRoomRepository;



          private GameRoom gameRoom= null;

          private Game game = new Game();

          private Integer count =0;
        private HashMap<Character,Integer> IndexRecorder = new HashMap<>();
        Random random = new Random();
          


          public  void startGame(String roomId) throws Exception{
            GameRoom gameRoom = gameRoomRepository.findByRoomId(roomId).orElseThrow(()->new Exception("GameRoom Not Found"));
            createGame();
            gameRoom.setGame(game);
          }


          public void createGame(){
            Random random = new Random();
            String [] randomWords = game.getRandomWords();
            game.setRandomlyChoosenWord(randomWords[random.nextInt(randomWords.length)]);
            char [] allCharactersOfTheWord = new char[game.getRandomlyChoosenWord().length()];
            String ret  = "";
                        for(char c: allCharactersOfTheWord){
                          if(c == '\u0000'){
                              ret = ret + "_";
                          }else{
                            ret = ret + c;
                          }
                          ret = ret + ' ';
                      }

            game.setGuessedString(ret);
          }
        


   





      // public void addGuess(char guessedChar) {
      //               if(isCharacterPresent(guessedChar)){
      //                 int startSearchingFrom =0;
      //                 if(IndexRecorder.containsKey(guessedChar)){
      //                       startSearchingFrom =IndexRecorder.get(guessedChar) + 1;
      //                 }
      //                 int idx = randomlyChoosenWord.indexOf(guessedChar,startSearchingFrom);
      //                 IndexRecorder.put(guessedChar,idx);
      //                 allCharactersOfTheWord[idx] = guessedChar;
      //               }else{
      //                 count ++;
                      
      //               }
      //     }


      // private boolean isCharacterPresent(char guessedChar) {
      //               return randomlyChoosenWord.indexOf(guessedChar)!= -1;
      // }



}