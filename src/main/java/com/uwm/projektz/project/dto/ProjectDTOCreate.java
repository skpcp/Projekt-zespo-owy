package com.uwm.projektz.project.dto;

import com.uwm.projektz.priority.dto.PriorityDTOName;
import io.swagger.annotations.ApiModel;

import java.io.Serializable;

/**
 * Created by Tomasz Komoszeski on 2016-05-11.
 */
@ApiModel
public class ProjectDTOCreate implements Serializable{
    String name;
    String descritpion;
    String version;
    String priority;

    public ProjectDTOCreate() {
    }

    public ProjectDTOCreate(String name, String descritpion, String version, String priority) {
        this.name = name;
        this.descritpion = descritpion;
        this.version = version;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescritpion() {
        return descritpion;
    }

    public void setDescritpion(String descritpion) {
        this.descritpion = descritpion;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
