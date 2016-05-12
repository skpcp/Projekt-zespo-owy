package com.uwm.projektz.user.dto;

import com.uwm.projektz.project.dto.ProjectDTO;
import io.swagger.annotations.ApiModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-05-12.
 */
@ApiModel
public class UserDTOProjects {
    Long id;
    List<ProjectDTO> projects = new ArrayList<>();

    public UserDTOProjects() {
    }

    public UserDTOProjects(Long id, List<ProjectDTO> projects) {
        this.id = id;
        this.projects = projects;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ProjectDTO> getProjects() {
        return projects;
    }

    public void setProjects(List<ProjectDTO> projects) {
        this.projects = projects;
    }
}
