package com.uwm.projektz.user.dto;

import com.uwm.projektz.project.dto.ProjectDTO;
import com.uwm.projektz.project.dto.ProjectDTOtoAdd;
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
    private List<ProjectDTOtoAdd> projects;

    public UserDTOProjects() {
    }

    public UserDTOProjects(Long id, List<ProjectDTOtoAdd> projects) {
        this.id = id;
        this.projects = projects;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ProjectDTOtoAdd> getProjects() {
        return projects;
    }

    public void setProjects(List<ProjectDTOtoAdd> projects) {
        this.projects = projects;
    }
}
