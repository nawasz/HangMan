package com.Cautio.hangman.Model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Document(collection = "Users")
@Data
public class UserEntity {
      @Id
    private String id;
    @NotNull
    private String username;
    
    private String password;
    //private List<String> roles; 
}
