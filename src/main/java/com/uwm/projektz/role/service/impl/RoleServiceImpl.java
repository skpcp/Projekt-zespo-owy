package com.uwm.projektz.role.service.impl;

import com.uwm.projektz.permission.dto.PermissionDTO;
import com.uwm.projektz.role.converter.RoleConverter;
import com.uwm.projektz.role.dto.RoleDTO;
import com.uwm.projektz.role.ob.RoleOB;
import com.uwm.projektz.role.repository.IRoleRepository;
import com.uwm.projektz.role.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */
@Service
@Transactional
public class RoleServiceImpl implements IRoleService {


    @Autowired
    IRoleRepository roleRepository;

    @Override
    public RoleDTO saveRole(RoleDTO aRoleDTO) {
        roleRepository.save(RoleConverter.converterRoleDTOtoOB(aRoleDTO));
        return aRoleDTO;
    }

    @Override
    public RoleDTO findPRoleById(Long aId) {
        return RoleConverter.converterRoleOBtoDTO(roleRepository.findOne(aId));
    }

    @Override
    public List<RoleDTO> findAllRole() {
        return RoleConverter.converterRoleListOBtoDTO(roleRepository.findAll());
    }

    @Override
    public RoleDTO findByName(String aName) {
        RoleOB role = roleRepository.findRoleByName(aName);
        return RoleConverter.converterRoleOBtoDTO(role);
    }

    @Override
    public void deleteRoleById(Long aId) {
        roleRepository.delete(aId);
    }
}
