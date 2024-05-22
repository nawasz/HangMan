package com.Cautio.hangman.Exchange;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@AllArgsConstructor
@NoArgsConstructor
public class GetUserRequest {
       @NotNull
       private String name;
      
       private String password;
       public GetUserRequest(@NotNull String name, String password) {
              this.name = name;
              this.password = password;
       }
}
