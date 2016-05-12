package com.uwm.projektz.ticket.dto;

import com.uwm.projektz.enums.TicketType;
import com.uwm.projektz.enums.Type;
import com.uwm.projektz.priority.dto.PriorityDTO;
import com.uwm.projektz.project.dto.ProjectDTO;
import com.uwm.projektz.user.dto.UserDTO;

import java.io.Serializable;

/**
 * Created by Tomasz Komoszeski on 2016-05-12.
 */
public class TicketDTOWithoutHistoriesAttachments implements Serializable {
    Long id;
    TicketType kind;
    Type type;
    String description;
    String user;
    Long priority;
    Long project;

    public TicketDTOWithoutHistoriesAttachments() {
    }

    public TicketDTOWithoutHistoriesAttachments(Long id, TicketType kind, Type type, String description, String user, Long priority, Long project) {
        this.id = id;
        this.kind = kind;
        this.type = type;
        this.description = description;
        this.user = user;
        this.priority = priority;
        this.project = project;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Long getPriority() {
        return priority;
    }

    public void setPriority(Long priority) {
        this.priority = priority;
    }

    public Long getProject() {
        return project;
    }

    public void setProject(Long project) {
        this.project = project;
    }
}
