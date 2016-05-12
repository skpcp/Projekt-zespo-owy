package com.uwm.projektz.user.dto;

import com.uwm.projektz.permission.dto.PermissionDTO;
import io.swagger.annotations.ApiModel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-05-12.
 */

@ApiModel
public class UserDTOPermissions implements Serializable {
    Long id;
    List<PermissionDTO> permissions =  new ArrayList<>();

    public UserDTOPermissions(Long id, List<PermissionDTO> permissions) {
        this.id = id;
        this.permissions = permissions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<PermissionDTO> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<PermissionDTO> permissions) {
        this.permissions = permissions;
    }
}
