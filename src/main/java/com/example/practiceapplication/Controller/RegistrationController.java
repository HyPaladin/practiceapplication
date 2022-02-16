
package com.example.practiceapplication.Controller;


import com.example.practiceapplication.model.RegistrationRequest;
import com.example.practiceapplication.service.RegistrationService;
import com.example.practiceapplication.service.UserDetailsService;
import com.example.practiceapplication.model.User;
import com.example.practiceapplication.repo.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
@RequestMapping("/public")
public class RegistrationController {

@Autowired
    private UserRepository userRepo;

    @Autowired
    private UserDetailsService detailsService;

    @Autowired
    private RegistrationService registrationService;




    @GetMapping("/signup")
    public String register(@RequestBody RegistrationRequest request) {
        return registrationService.register(request);
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

}
