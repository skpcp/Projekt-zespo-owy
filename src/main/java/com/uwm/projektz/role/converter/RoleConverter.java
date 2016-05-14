package com.uwm.projektz.role.converter;

import com.uwm.projektz.permission.converter.PermissionConverter;
import com.uwm.projektz.role.dto.RoleDTO;
import com.uwm.projektz.role.ob.RoleOB;

import java.util.ArrayList;
import java.util.List;


public class RoleConverter {

//Role
    public static RoleDTO converterRoleOBtoDTO(RoleOB aRoleOb)
    {
        if (aRoleOb == null) return null;
        return new RoleDTO(aRoleOb.getId(),aRoleOb.getTechDate(),aRoleOb.getName(), PermissionConverter.converterPermissionListOBtoDTO(aRoleOb.getPermissions()));
    }


//RoleLists
    public static List<RoleDTO> converterRoleListOBtoDTO (List<RoleOB> aRoleListOB){
        if (aRoleListOB == null) return null;
        List<RoleDTO> temp = new ArrayList<RoleDTO>();

        for (RoleOB element : aRoleListOB){
            temp.add(converterRoleOBtoDTO(element));
        }
        return temp;
    }


}