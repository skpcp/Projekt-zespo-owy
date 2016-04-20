package com.uwm.projektz.role.service;

import com.uwm.projektz.permission.dto.PermissionDTO;
import com.uwm.projektz.role.dto.RoleDTO;

import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */
public interface IRoleService {
    //CREATE & UPDATE
    RoleDTO saveRole(RoleDTO aRoleDTO);

    //UPDATE
    RoleDTO updatePermissionForRole(PermissionDTO aPermissionDTO);
    //READ
    RoleDTO findPRoleById(Long aId);
    List<RoleDTO> findAllRole();
    RoleDTO findByName(String aName);

    //DELETE
    void deleteRoleById(Long aId);
}
