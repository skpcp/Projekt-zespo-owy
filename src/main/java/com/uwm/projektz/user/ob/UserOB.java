package com.uwm.projektz.user.ob;
import com.uwm.projektz.base.ob.BaseOB;
import com.uwm.projektz.permission.ob.PermissionOB;
import com.uwm.projektz.project.ob.ProjectOB;
import com.uwm.projektz.role.ob.RoleOB;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by wojni on 10.03.2016.
 */
@Entity
@Table(name = "users")
@SequenceGenerator(initialValue = 1,name = "SEQ",sequenceName = "GEN_USER_ID")
public class UserOB extends BaseOB {
    private String name;
    private String surname;
    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String login;
    private String md5pass;
    private Boolean active;
    @ManyToOne( fetch = FetchType.LAZY)
    @JoinColumn(name = "OWNER_ID", referencedColumnName = "ID")
    private RoleOB role;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "USER_PROJECT",
            joinColumns = @JoinColumn(name ="USER_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "PROJECT_ID",referencedColumnName = "ID")
    )
    private List<ProjectOB> projects = new ArrayList<>();
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "USER_PERMISSION",
            joinColumns = @JoinColumn(name ="USER_ID",referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "PERMISSION_ID",referencedColumnName = "ID")
    )
    private List<PermissionOB> permissions = new ArrayList<>();

    public UserOB() {
    }

    public UserOB(String name, String surname, String email, String login, String md5pass) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.login = login;
        this.md5pass = md5pass;
    }

    public UserOB(String name, String surname, String email, String login, String md5pass, Boolean active, RoleOB role, List<ProjectOB> projects, List<PermissionOB> permissions) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.login = login;
        this.md5pass = md5pass;
        this.active = active;
        this.role = role;
        this.projects = projects;
        this.permissions = permissions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMd5pass() {
        return md5pass;
    }

    public void setMd5pass(String md5pass) {
        this.md5pass = md5pass;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public RoleOB getRole() {
        return role;
    }

    public void setRole(RoleOB role) {
        this.role = role;
    }

    public List<ProjectOB> getProjects() {
        return projects;
    }

    public void setProjects(List<ProjectOB> projects) {
        this.projects = projects;
    }

    public List<PermissionOB> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<PermissionOB> permissions) {
        this.permissions = permissions;
    }
}


