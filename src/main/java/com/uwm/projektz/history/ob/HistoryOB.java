package com.uwm.projektz.history.ob;

import com.uwm.projektz.attachment.ob.AttachmentOB;
import com.uwm.projektz.base.ob.BaseOB;
import com.uwm.projektz.enums.Type;
import com.uwm.projektz.user.ob.UserOB;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by wojni on 10.03.2016.
 */
@Entity
@Table(name = "histories")
@SequenceGenerator(initialValue = 1,name = "SEQ",sequenceName = "GEN_HISTORY_ID")
public class HistoryOB extends BaseOB {
    private Type type;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID" , referencedColumnName = "ID",nullable = false)
    private UserOB user;
    private String description;
    @Column(columnDefinition = "DATE")
    private Date date;
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
    @JoinColumn(name = "HISTORY_ID", referencedColumnName = "ID",nullable = true)
    private List<AttachmentOB> attachments;

    public HistoryOB(){}

    public HistoryOB(Type type, UserOB user, String description, Date date, List<AttachmentOB> attachments) {
        this.type = type;
        this.user = user;
        this.description = description;
        this.date = date;
        this.attachments = attachments;
    }

    public HistoryOB(Type type, String description, Date date) {
        this.type = type;
        this.description = description;
        this.date = date;
        this.attachments = new ArrayList<>();
        this.user = null;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public UserOB getUser() {
        return user;
    }

    public void setUser(UserOB user) {
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

    public List<AttachmentOB> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<AttachmentOB> attachments) {
        this.attachments = attachments;
    }
}
