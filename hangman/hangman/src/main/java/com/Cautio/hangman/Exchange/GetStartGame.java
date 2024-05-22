package com.Cautio.hangman.Exchange;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetStartGame {

          private String roomId;
          private String word;
          
}
