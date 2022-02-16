package com.example.practiceapplication.service;

import com.example.practiceapplication.model.RegistrationRequest;
import org.springframework.web.bind.annotation.RequestBody;


public class RegistrationService {
    public String register(RegistrationRequest request){
        return "works";
    }
}
