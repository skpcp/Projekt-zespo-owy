package com.uwm.projektz.ob;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-04-15.
 */
@Entity
@Table(name = "roles")
@SequenceGenerator(initialValue = 1,name = "SEQ",sequenceName = "GEN_ROLE_ID")
public class RoleOB extends BaseOB {
    String name;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name ="ROLE_ID",referencedColumnName = "ID")
    List<PermissionOB> permissions;


    public RoleOB() {
    }

    public RoleOB(String name, List<PermissionOB> permissions) {
        this.name = name;
        this.permissions = permissions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PermissionOB> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<PermissionOB> permissions) {
        this.permissions = permissions;
    }
}
