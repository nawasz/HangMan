package com.Cautio.hangman;


import java.util.HashSet;
import java.util.Set;

public class HangmanGame {
    private String word;
    private Set<Character> guessedLetters = new HashSet<>();
    private int remainingAttempts = 6; // Example number of attempts
    private Set<Character> incorrectGuesses = new HashSet<>();

    public HangmanGame(String word) {
        this.word = word;
    }

    public boolean guessLetter(char letter) {
        if (word.indexOf(letter) >= 0) {
            guessedLetters.add(letter);
            return true;
        } else {
            incorrectGuesses.add(letter);
            remainingAttempts--;
            return false;
        }
    }

    public String getCurrentWordState() {
        StringBuilder currentState = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (guessedLetters.contains(c)) {
                currentState.append(c);
            } else {
                currentState.append('_');
            }
        }
        return currentState.toString();
    }

    public boolean isGameOver() {
        return remainingAttempts <= 0 || isWordGuessed();
    }

    public boolean isWordGuessed() {
        for (char c : word.toCharArray()) {
            if (!guessedLetters.contains(c)) {
                return false;
            }
        }
        return true;
    }

    // Getters for remainingAttempts, incorrectGuesses, etc.
}
