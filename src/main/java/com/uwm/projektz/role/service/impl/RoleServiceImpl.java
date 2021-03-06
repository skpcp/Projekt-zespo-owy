package com.uwm.projektz.role.service.impl;

import com.uwm.projektz.MyServerException;
import com.uwm.projektz.permission.dto.PermissionDTO;
import com.uwm.projektz.permission.dto.PermissionDTOtoAdd;
import com.uwm.projektz.permission.ob.PermissionOB;
import com.uwm.projektz.permission.repository.IPermissionRepository;
import com.uwm.projektz.role.converter.RoleConverter;
import com.uwm.projektz.role.dto.RoleDTO;
import com.uwm.projektz.role.dto.RoleDTOCreate;
import com.uwm.projektz.role.ob.RoleOB;
import com.uwm.projektz.role.repository.IRoleRepository;
import com.uwm.projektz.role.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */
@Service
@Transactional
public class RoleServiceImpl implements IRoleService {


    @Autowired
    IRoleRepository roleRepository;

    @Autowired
    IPermissionRepository permissionRepository;

    @Override
    public RoleDTO saveRole(RoleDTOCreate aRoleDTO) throws MyServerException {
        RoleOB pRoleOB = aRoleDTO.getId() == null ? null : roleRepository.findOne(aRoleDTO.getId());
        //i przy zmianie tez bedzie trzeba wyszukac dlatego robie to od razu
        if(pRoleOB == null)
        {
            pRoleOB = new RoleOB(aRoleDTO.getName()); //tworzę nową instancje
        }
        else
        {
            pRoleOB.setName(aRoleDTO.getName());//zmien nazwe
        }
        List<PermissionOB> permissionOBList = pRoleOB.getPermissions();
        if(aRoleDTO.getPermissions() == null) throw new MyServerException("Permissions field not found", HttpStatus.NOT_FOUND);

        //czy Rola jest czy jej nie ma permission się należy
        for(PermissionDTOtoAdd permission : aRoleDTO.getPermissions()){
            PermissionOB permissionOB = permission.getId() == null ? null : permissionRepository.findOne(permission.getId());
            if(permissionOB == null) throw new MyServerException("Permission not found",HttpStatus.NOT_FOUND);
            if(!permissionOBList.contains(permissionOB)) permissionOBList.add(permissionOB);
        }
        pRoleOB.setPermissions(permissionOBList);
        return RoleConverter.converterRoleOBtoDTO(roleRepository.save(pRoleOB));
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
    public void deleteRoleById(Long aId) throws MyServerException
    {
        RoleOB role = roleRepository.findOne(aId);
        if(role == null) throw new MyServerException("Role not found",HttpStatus.NOT_FOUND);
        roleRepository.delete(aId);
    }
}
