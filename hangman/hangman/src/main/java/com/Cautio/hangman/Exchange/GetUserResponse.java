package com.Cautio.hangman.Exchange;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetUserResponse {
        private String Id;
        private String UserName;
        private String password;  
}
