package com.uwm.projektz.permission.converter;

import com.uwm.projektz.attachment.dto.AttachmentDTO;
import com.uwm.projektz.attachment.ob.AttachmentOB;
import com.uwm.projektz.binary.dto.BinaryDTO;
import com.uwm.projektz.binary.ob.BinaryOB;
import com.uwm.projektz.history.dto.HistoryDTO;
import com.uwm.projektz.history.ob.HistoryOB;
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


public class PermissionConverter {


//Permission
    public static PermissionDTO converterPermissionOBtoDTO(PermissionOB aPermissionOB)
    {
        if (aPermissionOB == null) return null;
        return new PermissionDTO(aPermissionOB.getId(),aPermissionOB.getTechDate(),aPermissionOB.getName());
    }
    public static PermissionOB converterPermissionDTOtoOB(PermissionDTO aPermissionDTO)
    {
        if (aPermissionDTO == null) return null;
        return new PermissionOB(aPermissionDTO.getId(),aPermissionDTO.getTechDate(),aPermissionDTO.getName());
    }
    //Permission Listy
    public static List<PermissionOB> converterPermissionListDTOtoOB(List<PermissionDTO> aPermissionList)
    {
        if (aPermissionList == null) return null;
        List<PermissionOB> temp = new ArrayList<>();

        for(PermissionDTO element : aPermissionList)
        {
            temp.add(converterPermissionDTOtoOB(element));
        }
        return temp;
    }
    public static List<PermissionDTO> converterPermissionListOBtoDTO(List<PermissionOB> aPermissionList)
    {
        if (aPermissionList == null) return null;
        List<PermissionDTO> temp = new ArrayList<>();

        for(PermissionOB element : aPermissionList)
        {
            temp.add(converterPermissionOBtoDTO(element));
        }
        return temp;
    }
}