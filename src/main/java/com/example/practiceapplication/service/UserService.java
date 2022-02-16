package com.example.practiceapplication.service;

import com.example.practiceapplication.model.User;
import com.example.practiceapplication.repo.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService implements UserDetailsService {

    private final static String USER_NOT_FOUND_MSG = "user with email%s not found";
    private final UserRepository userRepository;


    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        try {
            return userRepository.findByEmail(email);
        }
        catch (UsernameNotFoundException e){
            System.out.println(String.format(USER_NOT_FOUND_MSG, email);
            return null;
        }

    }
}
