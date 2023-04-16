package com.calvin.backend.controller;

import com.calvin.backend.config.callback.LoginCallback;
import com.calvin.backend.dto.request.LoginRequest;
import com.calvin.backend.dto.response.LoginResponse;
import com.calvin.backend.template.RequestServiceTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LoginController {

    @Autowired
    LoginCallback loginCallback;

    @PostMapping(path = "/login", produces = "application/json")
    public LoginResponse login(LoginRequest request) {
        return new RequestServiceTemplate().runQuery(loginCallback, request);
    }

}
