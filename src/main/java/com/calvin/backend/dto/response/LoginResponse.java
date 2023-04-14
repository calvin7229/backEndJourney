package com.calvin.backend.dto.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginResponse {

    private String token;
}
