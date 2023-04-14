package com.calvin.backend.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "USER")
public class User {

    @Id
    private Long id;

    @Column(name="USER_NAME", length = 255, nullable = false, unique = true )
    private String username;

}
