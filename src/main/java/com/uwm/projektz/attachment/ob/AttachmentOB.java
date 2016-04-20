package com.uwm.projektz.attachment.ob;


import com.uwm.projektz.base.ob.BaseOB;
import com.uwm.projektz.enums.Type;
import com.uwm.projektz.binary.ob.BinaryOB;
import com.uwm.projektz.user.ob.UserOB;

import javax.persistence.*;

/**
 * Created by wojni on 11.03.2016.
 */
@Entity
@Table(name = "attachments")
@SequenceGenerator(initialValue = 1,name = "SEQ",sequenceName = "GEN_ATTACHMENT_ID")
public class AttachmentOB extends BaseOB {
    Type type;
    String name;
    String file_name;
    String mine_type;
    @ManyToOne(fetch = FetchType.LAZY ,cascade = CascadeType.ALL)
    @JoinColumn(name = "BINARY_ID", referencedColumnName = "ID")
    BinaryOB binary;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID" , referencedColumnName = "ID")
    UserOB user;

    public AttachmentOB() {
    }

    public AttachmentOB(Type type, String name, String file_name, String mine_type, BinaryOB binary, UserOB user) {
        this.type = type;
        this.name = name;
        this.file_name = file_name;
        this.mine_type = mine_type;
        this.binary = binary;
        this.user = user;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public String getMine_type() {
        return mine_type;
    }

    public void setMine_type(String mine_type) {
        this.mine_type = mine_type;
    }

    public BinaryOB getBinary() {
        return binary;
    }

    public void setBinary(BinaryOB binary) {
        this.binary = binary;
    }

    public UserOB getUser() {
        return user;
    }

    public void setUser(UserOB user) {
        this.user = user;
    }
}
