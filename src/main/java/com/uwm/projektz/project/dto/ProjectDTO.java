package com.uwm.projektz.project.dto;

import com.uwm.projektz.base.dto.BaseDTO;
import com.uwm.projektz.priority.dto.PriorityDTO;
import io.swagger.annotations.ApiModel;

import java.util.Date;

/**
 * Created by wojni on 10.03.2016.
 */

@ApiModel
public class ProjectDTO extends BaseDTO {
   private String name;
   private String descritpion;
   private String version;
   private PriorityDTO priority;


    public ProjectDTO() {
    }

    public ProjectDTO(Long id, Date techdate, String name, String desc, String version, PriorityDTO priority)
    {
        super(id,techdate);
        this.name = name;
        this.descritpion = desc;
        this.version = version;
        this.priority = priority;
    }

    public ProjectDTO(String name, String descritpion, String version, PriorityDTO priority) {
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

    public PriorityDTO getPriority() {
        return priority;
    }

    public void setPriority(PriorityDTO priority) {
        this.priority = priority;
    }
}
