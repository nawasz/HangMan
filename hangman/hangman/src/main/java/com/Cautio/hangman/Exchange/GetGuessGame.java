package com.Cautio.hangman.Exchange;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetGuessGame {
          private String roomId;
          private String letter;
}
