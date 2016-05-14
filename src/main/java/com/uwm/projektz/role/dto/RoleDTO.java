package com.uwm.projektz.role.dto;

import com.uwm.projektz.base.dto.BaseDTO;
import com.uwm.projektz.permission.dto.PermissionDTO;
import io.swagger.annotations.ApiModel;

import java.util.Date;
import java.util.List;

@ApiModel
public class RoleDTO extends BaseDTO {
    private String name;
    private List<PermissionDTO> permissions;

    public RoleDTO(Long id, Date techDate, String name, List<PermissionDTO> permissions) {
        super(id, techDate);
        this.name = name;
        this.permissions = permissions;
    }

    public RoleDTO(String name, List<PermissionDTO> permissions) {
        this.name = name;
        this.permissions = permissions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PermissionDTO> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<PermissionDTO> permissions) {
        this.permissions = permissions;
    }
}
