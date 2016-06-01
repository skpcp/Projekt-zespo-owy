package com.uwm.projektz.user.dto;

import io.swagger.annotations.ApiModel;

import java.io.Serializable;

/**
 * Created by Tomasz Komoszeski on 2016-06-01.
 */

@ApiModel
public class UserDTOLogin implements Serializable {
    private String login;
    private String password;

    public UserDTOLogin() {
    }

    public UserDTOLogin(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
