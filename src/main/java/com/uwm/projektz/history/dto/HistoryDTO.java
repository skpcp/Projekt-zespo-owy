package com.uwm.projektz.history.dto;

import com.uwm.projektz.attachment.dto.AttachmentDTO;
import com.uwm.projektz.base.dto.BaseDTO;
import com.uwm.projektz.enums.Type;
import com.uwm.projektz.user.dto.UserDTO;
import com.uwm.projektz.user.dto.UserDTOWithoutMd5Pass;
import io.swagger.annotations.ApiModel;

import java.util.Date;
import java.util.List;

/**
 * Created by wojni on 10.03.2016.
 */

@ApiModel
public class HistoryDTO extends BaseDTO {
    Type type;
    UserDTOWithoutMd5Pass user;
    String description;
    Date date;
    List<AttachmentDTO> attachments;

    public HistoryDTO() {
    }

    public HistoryDTO(Long id, Date techDate, Type type, UserDTOWithoutMd5Pass user, String description, Date date, List<AttachmentDTO> attachments) {
        super(id, techDate);
        this.type = type;
        this.user = user;
        this.description = description;
        this.date = date;
        this.attachments = attachments;
    }

    public HistoryDTO(Type type, UserDTOWithoutMd5Pass user, String description, Date date, List<AttachmentDTO> attachments) {
        this.type = type;
        this.user = user;
        this.description = description;
        this.date = date;
        this.attachments = attachments;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public UserDTOWithoutMd5Pass getUser() {
        return user;
    }

    public void setUser(UserDTOWithoutMd5Pass user) {
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

    public List<AttachmentDTO> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<AttachmentDTO> attachments) {
        this.attachments = attachments;
    }
}
