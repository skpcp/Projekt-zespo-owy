package com.uwm.projektz.history.dto;

import com.uwm.projektz.enums.Type;
import io.swagger.annotations.ApiModel;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-06-01.
 */
@ApiModel
public class HistoryDTOStringWithAttachments implements Serializable {
    private Long id;
    private Type type;
    private String user;
    private String description;
    private String date;
    private List<Long> attachments;

    public HistoryDTOStringWithAttachments() {
    }

    public HistoryDTOStringWithAttachments(Long id, Type type, String user, String description, String date, List<Long> attachments) {
        this.id = id;
        this.type = type;
        this.user = user;
        this.description = description;
        this.date = date;
        this.attachments = attachments;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Long> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Long> attachments) {
        this.attachments = attachments;
    }
}
