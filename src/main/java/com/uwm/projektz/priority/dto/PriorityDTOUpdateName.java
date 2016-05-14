package com.uwm.projektz.priority.dto;

import io.swagger.annotations.ApiModel;

import java.io.Serializable;

/**
 * Created by Tomasz Komoszeski on 2016-05-14.
 */
@ApiModel
public class PriorityDTOUpdateName implements Serializable {
    private Long id;
    private String aName;

    public PriorityDTOUpdateName() {
    }

    public PriorityDTOUpdateName(Long id, String aName) {
        this.id = id;
        this.aName = aName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }
}
