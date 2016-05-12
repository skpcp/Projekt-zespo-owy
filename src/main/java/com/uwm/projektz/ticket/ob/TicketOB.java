package com.uwm.projektz.ticket.ob;

import com.uwm.projektz.attachment.ob.AttachmentOB;
import com.uwm.projektz.base.ob.BaseOB;
import com.uwm.projektz.enums.TicketType;
import com.uwm.projektz.enums.Type;
import com.uwm.projektz.history.ob.HistoryOB;
import com.uwm.projektz.priority.ob.PriorityOB;
import com.uwm.projektz.project.ob.ProjectOB;
import com.uwm.projektz.user.ob.UserOB;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by wojni on 11.03.2016.
 */
@Entity
@Table(name = "tickets")
@SequenceGenerator(initialValue = 1,name = "SEQ",sequenceName = "GEN_TICKET_ID")
public class TicketOB extends BaseOB {
    TicketType kind;
    Type type;
    String description;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID" , referencedColumnName = "ID")
    UserOB user;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRIORITY_ID" , referencedColumnName = "ID")
    PriorityOB priority;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PROJECT_ID" , referencedColumnName = "ID")
    ProjectOB project;
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
    @JoinColumn(name = "TICKET_ID" , referencedColumnName = "ID")
    List<HistoryOB> histories;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "TICKET_ID" , referencedColumnName = "ID")
    List<AttachmentOB> attachments;



    public TicketOB(){}

    public TicketOB(TicketType kind, Type type, String description, UserOB user, PriorityOB priority, ProjectOB project, List<HistoryOB> histories, List<AttachmentOB> attachments) {
        this.kind = kind;
        this.type = type;
        this.description = description;
        this.user = user;
        this.priority = priority;
        this.project = project;
        this.histories = histories;
        this.attachments = attachments;
    }

    public TicketOB(Long id, Date techdate, TicketType kind, Type type, String description, UserOB user, PriorityOB priority, ProjectOB project, List<HistoryOB> histories, List<AttachmentOB> attachments) {
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

    public UserOB getUser() {
        return user;
    }

    public void setUser(UserOB user) {
        this.user = user;
    }

    public PriorityOB getPriority() {
        return priority;
    }

    public void setPriority(PriorityOB priority) {
        this.priority = priority;
    }

    public ProjectOB getProject() {
        return project;
    }

    public void setProject(ProjectOB project) {
        this.project = project;
    }

    public List<HistoryOB> getHistories() {
        return histories;
    }

    public void setHistories(List<HistoryOB> histories) {
        this.histories = histories;
    }

    public List<AttachmentOB> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<AttachmentOB> attachments) {
        this.attachments = attachments;
    }
}


