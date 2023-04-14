package com.calvin.backend.controller;

import com.calvin.backend.dto.request.LoginRequest;
import com.calvin.backend.dto.response.LoginResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class LoginController {


    @PostMapping(path = "/login",produces = "application/json")
    public LoginResponse login(LoginRequest request) {


        return new LoginResponse("Test");
    }

}
