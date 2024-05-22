package com.Cautio.hangman.Repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Cautio.hangman.Model.UserEntity;
@Repository
public interface UserRepository extends MongoRepository<UserEntity, String> {
          Optional<UserEntity> findByUsername(String username);
      }