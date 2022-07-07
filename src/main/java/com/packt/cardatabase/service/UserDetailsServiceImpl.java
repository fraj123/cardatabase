package com.packt.cardatabase.service;

import java.util.Optional;

import com.packt.cardatabase.domain.User;
import com.packt.cardatabase.domain.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

  @Autowired
  private UserRepository userRepository;

  @Override
  public UserDetails loadUserByUsername(String username)
    throws UsernameNotFoundException {
    Optional<User> user = userRepository.findByUsername(username);
    UserBuilder userBuilder = null;
    if(user.isPresent()) {
      User currentUser = user.get();
      userBuilder = org.springframework.security.core.userdetails.User.withUsername(username);
      userBuilder.password(currentUser.getPassword());
      userBuilder.roles(currentUser.getRole());
    } else {
      throw new UsernameNotFoundException("User not found");
    }

    return userBuilder.build();
  }
}

