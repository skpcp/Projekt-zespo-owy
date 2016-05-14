package com.uwm.projektz.user.dto;

import com.google.common.annotations.VisibleForTesting;
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
    private Long id;
    private List<String> permissions;

    public UserDTOPermissions() {
    }

    public UserDTOPermissions(Long id, List<String> permissions) {
        this.id = id;
        this.permissions = permissions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }
}
