package com.uwm.projektz.role.service.impl;

import com.uwm.projektz.permission.dto.PermissionDTO;
import com.uwm.projektz.role.dto.RoleDTO;
import com.uwm.projektz.role.service.IRoleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */
@Service
@Transactional
public class RoleServiceImpl implements IRoleService {
    @Override
    public RoleDTO saveRole(RoleDTO aRoleDTO) {
        return null;
    }

    @Override
    public RoleDTO updatePermissionForRole(PermissionDTO aPermissionDTO) {
        return null;
    }

    @Override
    public RoleDTO findPRoleById(Long aId) {
        return null;
    }

    @Override
    public List<RoleDTO> findAllRole() {
        return null;
    }

    @Override
    public RoleDTO findByName(String aName) {
        return null;
    }

    @Override
    public void deleteRoleById(Long aId) {

    }
}
