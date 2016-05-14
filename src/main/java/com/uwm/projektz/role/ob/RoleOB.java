package com.uwm.projektz.role.ob;

import com.uwm.projektz.base.ob.BaseOB;
import com.uwm.projektz.permission.ob.PermissionOB;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-04-15.
 */
@Entity
@Table(name = "roles")
@SequenceGenerator(initialValue = 1,name = "SEQ",sequenceName = "GEN_ROLE_ID")
public class RoleOB extends BaseOB {
    private String name;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name ="ROLES_PERMISSIONS",
            joinColumns = @JoinColumn(name="ROLE_ID",referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "PROJ_ID",referencedColumnName = "ID")
            )
    private List<PermissionOB> permissions = new ArrayList<>();


    public RoleOB(){}

    public RoleOB(String name) {
        this.name = name;
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
