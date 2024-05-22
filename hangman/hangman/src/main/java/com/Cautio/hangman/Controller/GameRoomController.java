package com.Cautio.hangman.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Cautio.hangman.Exchange.GetGuessGame;
import com.Cautio.hangman.Exchange.GetStartGame;
import com.Cautio.hangman.Model.GameRoom;
import com.Cautio.hangman.service.GameRoomService;
import com.Cautio.hangman.service.GameService;

@Controller
@RequestMapping("/api/gameroom")
public class GameRoomController {
        //      @Autowired
        //   private  GameRoomService gameRoomService;

          @Autowired
          private GameService gameService;
        //   @PostMapping("/create")
    // public GameRoom createGameRoom(@RequestBody String hostUsername) {
    //     return gameRoomService.createGameRoom(hostUsername);
    // }
    // @PostMapping("/join")
    // public Optional<GameRoom> joinGameRoom(@RequestBody String roomId, @RequestParam String playerUsername) {
    //     return gameRoomService.joinGameRoom(roomId, playerUsername);
    // }

    @PostMapping("/start")
    public GameRoom startGame(@RequestBody String roomId) throws Exception {
        gameService.startGame(roomId);
        return null;
    }
    
    // public ResponseEntity<Void> startGame(@RequestBody GetStartGame getStartGame) {
    //     gameRoomService.startGame(getStartGame.getRoomId(), getStartGame.getWord());
    //     System.out.println("game started");
    //     return ResponseEntity.ok().build();
    // }
    @PostMapping("/guess")
    public ResponseEntity<Boolean> makeGuess(@RequestBody GetGuessGame getGuessGame) {
        //boolean correct = gameRoomService.makeGuess(getGuessGame.getRoomId(), getGuessGame.getLetter().charAt(0));
        return ResponseEntity.ok(correct);
    }
}
