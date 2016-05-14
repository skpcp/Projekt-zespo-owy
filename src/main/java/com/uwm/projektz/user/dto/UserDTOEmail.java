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

    public UserDTOEmail() {
    }

    public UserDTOEmail(Long id, String email) {
        this.id = id;
        this.email = email;
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


}
