package com.Cautio.hangman.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Cautio.hangman.Exchange.GetUserRequest;
import com.Cautio.hangman.Model.UserEntity;
import com.Cautio.hangman.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api")
public class UserController {
          @Autowired
          private UserService userService;
          @PostMapping("/User")
          public ResponseEntity<UserEntity> createUser(@RequestBody  @jakarta.validation.Valid GetUserRequest getUserRequest) {
                   UserEntity user = userService.generateUser( getUserRequest.getName(),getUserRequest.getPassword());
              
              return ResponseEntity.ok(user);
          }
          
       
          
}
