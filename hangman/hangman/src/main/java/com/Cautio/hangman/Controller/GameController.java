package com.Cautio.hangman.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Cautio.hangman.service.GameService;


@Controller
public class GameController {
    @Autowired
    private GameService gameService;

          @GetMapping("/game-home")
          public String showGamePage(@RequestParam(value="guessedChar",required = false)String guessedWord,Model model) {
            String randomWord =  gameService.toString();
            System.out.println(randomWord);
            
            if(guessedWord != null){
                gameService.addGuess(guessedWord.charAt(0));
                randomWord =  gameService.toString();
            }
            
          model.addAttribute("wordToDisplay", randomWord);
              return "game";
          }
          
          
}
