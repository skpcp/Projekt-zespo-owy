package com.uwm.projektz.role.dto;

import com.uwm.projektz.base.dto.BaseDTO;
import com.uwm.projektz.permission.dto.PermissionDTO;
import io.swagger.annotations.ApiModel;

import java.util.Date;
import java.util.List;

@ApiModel
public class RoleDTO extends BaseDTO {
    String name;
    List<PermissionDTO> permissions;

    public RoleDTO() {
    }

    public RoleDTO(Long id, Date techdate, String Name, List<PermissionDTO> permissions)
    {
        super(id,techdate);
        this.name = Name;
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
