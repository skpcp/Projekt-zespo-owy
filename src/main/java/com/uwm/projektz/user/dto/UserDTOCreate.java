package com.uwm.projektz.user.dto;

import io.swagger.annotations.ApiModel;

import java.io.Serializable;

/**
 * Created by Tomasz Komoszeski on 2016-05-11.
 */
@ApiModel
public class UserDTOCreate implements Serializable {
    String name;
    String surname;
    String email;
    String login;
    String md5pass;

    public UserDTOCreate() {
    }

    public UserDTOCreate(String name, String surname, String email, String login, String md5pass) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.login = login;
        this.md5pass = md5pass;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMd5pass() {
        return md5pass;
    }

    public void setMd5pass(String md5pass) {
        this.md5pass = md5pass;
    }
}
