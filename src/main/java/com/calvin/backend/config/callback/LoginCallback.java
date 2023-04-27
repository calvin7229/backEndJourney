package com.calvin.backend.config.callback;

import com.calvin.backend.dto.request.LoginRequest;
import com.calvin.backend.dto.response.LoginResponse;
import com.calvin.backend.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginCallback implements BaseCallback<LoginRequest, LoginResponse> {

    @Autowired
    AuthService authService;
    @Override
    public LoginResponse query() {
        return new LoginResponse("TEST");
    }

    //public static convert()
}
