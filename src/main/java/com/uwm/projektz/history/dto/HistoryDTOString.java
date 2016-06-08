package com.uwm.projektz.history.dto;

import com.uwm.projektz.enums.Type;
import io.swagger.annotations.ApiModel;

import java.io.Serializable;

/**
 * Created by Tomasz Komoszeski on 2016-06-01.
 */

@ApiModel
public class HistoryDTOString implements Serializable {
    private Long id;
    private Type type;
    private String user;
    private String description;


    public HistoryDTOString(Long id, Type type, String user, String description) {
        this.id = id;
        this.type = type;
        this.user = user;
        this.description = description;
    }

    public HistoryDTOString() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
