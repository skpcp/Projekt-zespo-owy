package com.uwm.projektz.permission.service.impl;

import com.uwm.projektz.permission.dto.PermissionDTO;
import com.uwm.projektz.permission.service.IPermissionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */
@Service
@Transactional
public class PermissionServiceImpl implements IPermissionService {
    @Override
    public PermissionDTO savePermission(PermissionDTO aPermissionDTO) {
        return null;
    }

    @Override
    public PermissionDTO findPermissionById(Long aId) {
        return null;
    }

    @Override
    public List<PermissionDTO> findAllPermission() {
        return null;
    }

    @Override
    public PermissionDTO findByName(String aName) {
        return null;
    }

    @Override
    public void deletePermissionById(Long aId) {

    }
}
