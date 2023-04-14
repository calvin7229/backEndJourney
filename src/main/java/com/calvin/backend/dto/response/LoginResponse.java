package com.calvin.backend.dto.response;


import com.calvin.backend.infra.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginResponse extends BaseResponse {

    private String token;
}
