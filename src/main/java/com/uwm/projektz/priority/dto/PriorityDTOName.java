package com.uwm.projektz.priority.dto;

import io.swagger.annotations.ApiModel;

import java.io.Serializable;

/**
 * Created by Tomasz Komoszeski on 2016-05-11.
 */
@ApiModel
public class PriorityDTOName implements Serializable{
    String name;

    public PriorityDTOName() {
    }

    public PriorityDTOName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
