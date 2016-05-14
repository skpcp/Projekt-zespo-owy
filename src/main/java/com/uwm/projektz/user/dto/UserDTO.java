package com.uwm.projektz.user.dto;

import com.uwm.projektz.base.dto.BaseDTO;
import com.uwm.projektz.permission.dto.PermissionDTO;
import com.uwm.projektz.project.dto.ProjectDTO;
import com.uwm.projektz.role.dto.RoleDTO;
import io.swagger.annotations.ApiModel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-05-12.
 */
@ApiModel
public class UserDTO extends BaseDTO {
    private String name;
    private String surname;
    private String email;
    private String login;
    private Boolean active;
    private RoleDTO role;
    private List<ProjectDTO> projects = new ArrayList<>();
    private List<PermissionDTO> permissions =  new ArrayList<>();

    public UserDTO() {
    }

    public UserDTO(Long id, Date techDate, String name, String surname, String email, String login, Boolean active, RoleDTO role, List<ProjectDTO> projects, List<PermissionDTO> permissions) {
        super(id, techDate);
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.login = login;
        this.active = active;
        this.role = role;
        this.projects = projects;
        this.permissions = permissions;
    }

    public UserDTO(String name, String surname, String email, String login, Boolean active, RoleDTO role, List<ProjectDTO> projects, List<PermissionDTO> permissions) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.login = login;
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

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public RoleDTO getRole() {
        return role;
    }

    public void setRole(RoleDTO role) {
        this.role = role;
    }

    public List<ProjectDTO> getProjects() {
        return projects;
    }

    public void setProjects(List<ProjectDTO> projects) {
        this.projects = projects;
    }

    public List<PermissionDTO> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<PermissionDTO> permissions) {
        this.permissions = permissions;
    }


}
