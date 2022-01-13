/*
package com.example.practiceapplication.Controller;


import com.example.practiceapplication.model.User;
import com.example.practiceapplication.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {
   */
/* @Autowired
    private UserRepository userRepo;

    @Autowired
    private UserDetailsService detailsService;*//*



    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }


    @GetMapping("/signup")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user",new User());
        return "signup";
    }

    @PostMapping("/registered")
    public String processSignup(User user) {
        System.out.println("Signup attempted");
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        //TODO Email verification
        user.setEnabled(Boolean.TRUE);
        userRepo.save(user);
        System.out.println("Signup successful");
        return "registered";
    }

}*/
