package com.Cautio.hangman.Model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.Cautio.hangman.HangmanGame;

import lombok.Data;

@Document(collection = "GameRoom")

public class GameRoom {
    @Id
    private String id;
    private String roomId;
    private UserEntity host;
    private Game game;
    private List<UserEntity> players = new ArrayList<>();

    public GameRoom(UserEntity host) {
        this.host = host;
        this.roomId = generateUniqueRoomId();
        this.players.add(host);

    }

    public UserEntity getHost() {
        return host;
    }

    public void setHost(UserEntity host) {
        this.host = host;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public void setPlayers(List<UserEntity> players) {
        this.players = players;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public List<UserEntity> getPlayers() {
          return players;
}
// public void startNewGame(String word) {
//     this.game = new Game(word);
// }
private String generateUniqueRoomId() {
        return java.util.UUID.randomUUID().toString();
    }

public Game getGame() {
    return game;
}
}
