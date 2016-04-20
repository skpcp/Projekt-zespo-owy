package com.uwm.projektz.permission.ob;

import com.uwm.projektz.base.ob.BaseOB;

import javax.persistence.*;

/**
 * Created by wojni on 11.03.2016.
 */
@Entity
@Table(name = "permissions")
@SequenceGenerator(initialValue = 1,name = "SEQ",sequenceName = "GEN_PERMISSION_ID")
public class PermissionOB extends BaseOB {
    @Column(unique = true)
    String name;
    public PermissionOB() {
    }

    public PermissionOB(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
