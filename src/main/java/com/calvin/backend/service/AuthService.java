package com.calvin.backend.service;

import com.calvin.backend.repository.CredentialRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AuthService {

    @Autowired
    CredentialRepository credentialRepository;

    public boolean register(){
        return true;
    }

    public String login(){
        return "TEST";
    }
}
