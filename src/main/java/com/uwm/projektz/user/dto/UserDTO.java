package com.uwm.projektz.user.dto;

import com.uwm.projektz.base.dto.BaseDTO;
import com.uwm.projektz.permission.dto.PermissionDTO;
import com.uwm.projektz.project.dto.ProjectDTO;
import com.uwm.projektz.role.dto.RoleDTO;
import io.swagger.annotations.ApiModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

@ApiModel
public class UserDTO extends BaseDTO {
    String name;
    String surname;
    String email;
    String login;
    String md5pass;
    Boolean active;
    RoleDTO role;
    List<ProjectDTO> projects = new ArrayList<>();
    List<PermissionDTO> permissions =  new ArrayList<>();

    public UserDTO() {
    }

    public UserDTO(Long id, Date techdate, String name, String surname, String email, String login, String md5pass, Boolean active, RoleDTO role, List<ProjectDTO> projects, List<PermissionDTO> permissions) {
        super(id,techdate);
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


