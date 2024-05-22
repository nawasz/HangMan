package com.Cautio.hangman.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Game {
          private String randomlyChoosenWord = null;
          private String guessedString;       
          private String[] randomWords ={"fatther","motther","sister","strrng","hello","liight","java"};
          
}
