package com.Cautio.hangman.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Cautio.hangman.Model.UserEntity;
import com.Cautio.hangman.Repository.UserRepository;
@Service
public class UserService {
          @Autowired
private UserRepository userRepository;
        

public UserEntity generateUser(String name, String password) {
         UserEntity user = new UserEntity();
         user.setUsername(name);
         user.setPassword(password);
         UserEntity userEntity =userRepository.save(user);
          return userEntity;
          
}

}
