package com.uwm.projektz.ob;
import com.uwm.projektz.enums.Type;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by wojni on 10.03.2016.
 */
@Entity
@Table(name = "histories")
@SequenceGenerator(initialValue = 1,name = "SEQ",sequenceName = "GEN_HISTORY_ID")
public class HistoryOB extends BaseOB {
    Type type;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID" , referencedColumnName = "ID")
    UserOB user;
    String description;
    Date date;

    public HistoryOB() {
    }

    public HistoryOB(Type type, UserOB user, String description, Date date) {
        this.type = type;
        this.user = user;
        this.description = description;
        this.date = date;
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
}
