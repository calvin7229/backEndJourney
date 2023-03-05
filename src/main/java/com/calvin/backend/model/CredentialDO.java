package com.calvin.backend.model;

import lombok.Data;

@Data
public class CredentialDO {

    int id;

    String username;

    String password;

    String salt;
}
