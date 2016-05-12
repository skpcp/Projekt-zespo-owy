package com.uwm.projektz.role.converter;

import com.uwm.projektz.attachment.dto.AttachmentDTO;
import com.uwm.projektz.attachment.ob.AttachmentOB;
import com.uwm.projektz.binary.dto.BinaryDTO;
import com.uwm.projektz.binary.ob.BinaryOB;
import com.uwm.projektz.history.dto.HistoryDTO;
import com.uwm.projektz.history.ob.HistoryOB;
import com.uwm.projektz.permission.converter.PermissionConverter;
import com.uwm.projektz.permission.dto.PermissionDTO;
import com.uwm.projektz.permission.ob.PermissionOB;
import com.uwm.projektz.priority.dto.PriorityDTO;
import com.uwm.projektz.priority.ob.PriorityOB;
import com.uwm.projektz.project.dto.ProjectDTO;
import com.uwm.projektz.project.ob.ProjectOB;
import com.uwm.projektz.role.dto.RoleDTO;
import com.uwm.projektz.role.ob.RoleOB;
import com.uwm.projektz.ticket.dto.TicketDTO;
import com.uwm.projektz.ticket.ob.TicketOB;
import com.uwm.projektz.user.dto.UserDTO;
import com.uwm.projektz.user.ob.UserOB;

import java.util.ArrayList;
import java.util.List;


public class RoleConverter {

//Role
    public static RoleDTO converterRoleOBtoDTO(RoleOB aRoleOb)
    {
        if (aRoleOb == null) return null;
        return new RoleDTO(aRoleOb.getId(),aRoleOb.getTechDate(),aRoleOb.getName(), PermissionConverter.converterPermissionListOBtoDTO(aRoleOb.getPermissions()));
    }

    public static RoleOB converterRoleDTOtoOB(RoleDTO aRoleDTO)
    {
        if (aRoleDTO == null) return null;
        return new RoleOB(aRoleDTO.getId(),aRoleDTO.getTechDate(),aRoleDTO.getName(),PermissionConverter.converterPermissionListDTOtoOB(aRoleDTO.getPermissions()));
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

    public static List<RoleOB> converterRoleListDTOtoOB (List<RoleDTO> aRoleListDTO){
        if (aRoleListDTO == null) return null;
        List<RoleOB> temp = new ArrayList<RoleOB>();

        for (RoleDTO element : aRoleListDTO){
            temp.add(converterRoleDTOtoOB(element));
        }
        return temp;
    }
}