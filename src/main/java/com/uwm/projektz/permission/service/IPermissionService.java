package com.uwm.projektz.permission.service;

import com.uwm.projektz.permission.dto.PermissionDTO;

import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */
public interface IPermissionService {
    //CREATE & UPDATE
    PermissionDTO savePermission(PermissionDTO aPermissionDTO);

    //READ
    PermissionDTO findPermissionById(Long aId);
    List<PermissionDTO> findAllPermission();
    PermissionDTO findByName(String aName);

    //DELETE
    void deletePermissionById(Long aId);
}
