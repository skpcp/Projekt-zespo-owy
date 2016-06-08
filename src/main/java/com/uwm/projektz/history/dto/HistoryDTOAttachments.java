package com.uwm.projektz.history.dto;

import com.uwm.projektz.attachment.dto.AttachmentDTOtoAdd;
import com.uwm.projektz.enums.Type;
import io.swagger.annotations.ApiModel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-05-14.
 */

@ApiModel
public class HistoryDTOAttachments implements Serializable{
    private Long id;
    private Type type;
    private String user;
    private String description;
    private List<AttachmentDTOtoAdd> attachments;

    public HistoryDTOAttachments() {
    }

    public HistoryDTOAttachments(Long id, Type type, String user, String description, List<AttachmentDTOtoAdd> attachments) {
        this.id = id;
        this.type = type;
        this.user = user;
        this.description = description;
        this.attachments = attachments;
    }

    public HistoryDTOAttachments(Long id, Type type, String user, String description) {
        this.id = id;
        this.type = type;
        this.user = user;
        this.description = description;
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

    public List<AttachmentDTOtoAdd> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<AttachmentDTOtoAdd> attachments) {
        this.attachments = attachments;
    }
}
