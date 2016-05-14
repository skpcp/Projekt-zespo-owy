package com.uwm.projektz.user.dto;

import com.uwm.projektz.project.dto.ProjectDTO;
import io.swagger.annotations.ApiModel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-05-12.
 */
@ApiModel
public class UserDTOProjects implements Serializable {
    private Long id;
    private List<String> projects;

    public UserDTOProjects() {
    }

    public UserDTOProjects(Long id, List<String> projects) {
        this.id = id;
        this.projects = projects;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<String> getProjects() {
        return projects;
    }

    public void setProjects(List<String> projects) {
        this.projects = projects;
    }
}
