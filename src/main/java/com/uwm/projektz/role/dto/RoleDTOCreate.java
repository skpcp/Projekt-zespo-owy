package com.uwm.projektz.role.dto;

import com.uwm.projektz.permission.dto.PermissionDTO;
import com.uwm.projektz.permission.dto.PermissionDTOtoAdd;
import io.swagger.annotations.ApiModel;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-05-14.
 */
@ApiModel
public class RoleDTOCreate implements Serializable
{
    private String name;
    private List<PermissionDTOtoAdd> permissions;

    public RoleDTOCreate() {
    }

    public RoleDTOCreate(String name, List<PermissionDTOtoAdd> permissions) {
        this.name = name;
        this.permissions = permissions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PermissionDTOtoAdd> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<PermissionDTOtoAdd> permissions) {
        this.permissions = permissions;
    }
}
