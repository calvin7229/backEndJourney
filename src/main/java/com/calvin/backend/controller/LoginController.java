package com.calvin.backend.controller;

import com.calvin.backend.dto.request.LoginRequest;
import com.calvin.backend.dto.response.LoginResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {


    @PostMapping(path="login")
    public LoginResponse login(LoginRequest request){


        return new LoginResponse();
    }

}
