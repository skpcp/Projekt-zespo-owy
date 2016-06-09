package com.uwm.projektz.project.dto;

import io.swagger.annotations.ApiModel;

import java.io.Serializable;

/**
 * Created by Tomasz Komoszeski on 2016-06-09.
 */
@ApiModel
public class ProjectDTOtoAdd implements Serializable {
    private Long id;

    public ProjectDTOtoAdd() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
