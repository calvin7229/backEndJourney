package com.calvin.backend.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "credentials")
public class CredentialDO {

    @Id
    int id;

    @Column(name = "username", length = 45, nullable = false, unique = true)
    String username;

    @Column(name = "password", length = 45, nullable = false)
    String password;

    @Column(name = "password", length = 45, nullable = false)
    String salt;
}
