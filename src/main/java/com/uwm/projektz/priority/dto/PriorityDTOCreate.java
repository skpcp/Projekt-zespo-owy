package com.uwm.projektz.priority.dto;

import io.swagger.annotations.ApiModel;

import java.io.Serializable;

/**
 * Created by Tomasz Komoszeski on 2016-05-14.
 */
@ApiModel
public class PriorityDTOCreate implements Serializable {
    private String name;
    private String responseTime;

    public PriorityDTOCreate() {
    }

    public PriorityDTOCreate(String name, String responseTime) {
        this.name = name;
        this.responseTime = responseTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(String responseTime) {
        this.responseTime = responseTime;
    }
}
