package com.calvin.backend.service;

import com.calvin.backend.repository.CrendentialsRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AuthService {

    @Autowired
    CrendentialsRepository crendentialsRepository;

    private boolean register(){
        return true;
    }

    private String login(){
        return "TEST";
    }
}
