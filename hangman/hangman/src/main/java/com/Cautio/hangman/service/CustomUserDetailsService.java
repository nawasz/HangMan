// package com.Cautio.hangman.service;

// import java.util.stream.Collectors;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.core.authority.SimpleGrantedAuthority;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UsernameNotFoundException;

// import com.Cautio.hangman.Model.UserEntity;
// import com.Cautio.hangman.UserEntityRepository.UserRepository;

// public class CustomUserDetailsService  implements UserDetailsService{
//           @Autowired
//     private UserRepository userRepository;

//           @Override
//           public UserDetails loadUserByUsername(String username) {
//                     UserEntity user = userRepository.findByUsername(username)
//                 .orElseThrow(() -> new UsernameNotFoundException("User not found"));
//         return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
//                 user.getRoles().stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList()));
//           }
          
// }
