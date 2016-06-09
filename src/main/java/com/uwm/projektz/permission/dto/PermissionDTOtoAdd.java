package com.uwm.projektz.permission.dto;

import io.swagger.annotations.ApiModel;

import java.io.Serializable;

/**
 * Created by Tomasz Komoszeski on 2016-06-09.
 */

@ApiModel
public class PermissionDTOtoAdd implements Serializable {
    private Long id;

    public PermissionDTOtoAdd() {
    }

    public PermissionDTOtoAdd(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
