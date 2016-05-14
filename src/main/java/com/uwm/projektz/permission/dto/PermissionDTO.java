package com.uwm.projektz.permission.dto;

import com.uwm.projektz.base.dto.BaseDTO;
import io.swagger.annotations.ApiModel;

import java.util.Date;

@ApiModel
public class PermissionDTO extends BaseDTO {
    private String name;

    public PermissionDTO() {
    }

    public PermissionDTO(String name) {
        this.name = name;
    }

    public PermissionDTO(Long id, Date techDate, String name) {
        super(id, techDate);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
