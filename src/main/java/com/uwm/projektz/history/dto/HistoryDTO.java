package com.uwm.projektz.history.dto;

import com.uwm.projektz.base.dto.BaseDTO;
import com.uwm.projektz.enums.Type;
import com.uwm.projektz.user.dto.UserDTO;
import io.swagger.annotations.ApiModel;

import java.util.Date;

/**
 * Created by wojni on 10.03.2016.
 */

@ApiModel
public class HistoryDTO extends BaseDTO {
    Type type;
    UserDTO user;
    String description;
    Date date;


    public HistoryDTO(Long id, Date techDate, Type type, UserDTO user, String description, Date date) {
        super(id, techDate);
        this.type = type;
        this.user = user;
        this.description = description;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
