package com.uwm.projektz.user.dto;

import io.swagger.annotations.ApiModel;

import java.io.Serializable;

/**
 * Created by Tomasz Komoszeski on 2016-05-14.
 */

@ApiModel
public class UserDTOEmail implements Serializable {
    private Long id;
    private String email;
    private String password;

    public UserDTOEmail() {
    }

    public UserDTOEmail(Long id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
