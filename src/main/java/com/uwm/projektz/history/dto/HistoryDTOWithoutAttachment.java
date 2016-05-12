package com.uwm.projektz.history.dto;

import com.uwm.projektz.enums.Type;
import com.uwm.projektz.user.dto.UserDTOId;
import io.swagger.annotations.ApiModel;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Tomasz Komoszeski on 2016-05-12.
 */
@ApiModel
public class HistoryDTOWithoutAttachment implements Serializable {
    Long id;
    Type type;
    String user;
    String description;
    Date date;

    public HistoryDTOWithoutAttachment() {
    }

    public HistoryDTOWithoutAttachment(Long id, Type type, String user, String description, Date date) {
        this.id = id;
        this.type = type;
        this.user = user;
        this.description = description;
        this.date = date;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
