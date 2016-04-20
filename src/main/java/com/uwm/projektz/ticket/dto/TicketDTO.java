package com.uwm.projektz.ticket.dto;

import com.uwm.projektz.attachment.dto.AttachmentDTO;
import com.uwm.projektz.base.dto.BaseDTO;
import com.uwm.projektz.enums.TicketType;
import com.uwm.projektz.enums.Type;
import com.uwm.projektz.history.dto.HistoryDTO;
import com.uwm.projektz.priority.dto.PriorityDTO;
import com.uwm.projektz.project.dto.ProjectDTO;
import com.uwm.projektz.user.dto.UserDTO;
import io.swagger.annotations.ApiModel;

import java.util.Date;
import java.util.List;

/**
 * Created by wojni on 11.03.2016.
 */

@ApiModel
public class TicketDTO extends BaseDTO {
    TicketType kind;
    Type type;
    String description;
    UserDTO user;
    PriorityDTO priority;
    ProjectDTO project;
    List<HistoryDTO> histories;
    List<AttachmentDTO> attachments;


    public TicketDTO(Long id, Date techdate,TicketType kind, Type type, String description, UserDTO user, PriorityDTO priority, ProjectDTO project, List<HistoryDTO> histories, List<AttachmentDTO> attachments) {
        super(id,techdate);
        this.kind = kind;
        this.type = type;
        this.description = description;
        this.user = user;
        this.priority = priority;
        this.project = project;
        this.histories = histories;
        this.attachments = attachments;
    }


    public TicketType getKind() {
        return kind;
    }

    public void setKind(TicketType kind) {
        this.kind = kind;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    public PriorityDTO getPriority() {
        return priority;
    }

    public void setPriority(PriorityDTO priority) {
        this.priority = priority;
    }

    public ProjectDTO getProject() {
        return project;
    }

    public void setProject(ProjectDTO project) {
        this.project = project;
    }

    public List<HistoryDTO> getHistories() {
        return histories;
    }

    public void setHistories(List<HistoryDTO> histories) {
        this.histories = histories;
    }

    public List<AttachmentDTO> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<AttachmentDTO> attachments) {
        this.attachments = attachments;
    }

}


