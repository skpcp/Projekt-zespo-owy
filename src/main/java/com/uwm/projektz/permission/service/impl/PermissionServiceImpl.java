package com.uwm.projektz.permission.service.impl;

import com.uwm.projektz.permission.converter.PermissionConverter;
import com.uwm.projektz.permission.dto.PermissionDTO;
import com.uwm.projektz.permission.ob.PermissionOB;
import com.uwm.projektz.permission.repository.IPermissionRepository;
import com.uwm.projektz.permission.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */
@Service
@Transactional
public class PermissionServiceImpl implements IPermissionService {

    @Autowired
    IPermissionRepository permissionRepository;

    @Override
    public PermissionDTO savePermission(PermissionDTO aPermissionDTO) {
        return PermissionConverter.converterPermissionOBtoDTO(permissionRepository.save(PermissionConverter.converterPermissionDTOtoOB(aPermissionDTO)));
    }

    @Override
    public PermissionDTO findPermissionById(Long aId) {
        PermissionOB temp = permissionRepository.findOne(aId);
        return PermissionConverter.converterPermissionOBtoDTO(temp);
    }

    @Override
    public List<PermissionDTO> findAllPermission() {
        List<PermissionOB> temp = permissionRepository.findAll();
        return PermissionConverter.converterPermissionListOBtoDTO(temp);
    }

    @Override
    public PermissionDTO findByName(String aName) {
        PermissionOB temp = permissionRepository.findPermissionByName(aName);
        return PermissionConverter.converterPermissionOBtoDTO(temp);
    }

    @Override
    public void deletePermissionById(Long aId) {
        permissionRepository.delete(aId);
    }
}
