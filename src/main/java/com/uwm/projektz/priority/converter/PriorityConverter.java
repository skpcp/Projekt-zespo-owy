package com.uwm.projektz.priority.converter;

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


public class PriorityConverter {

//Priority
    public static PriorityDTO converterPriorityOBtoDTO(PriorityOB aPriorityOB){
        if (aPriorityOB == null) return null;
        return new PriorityDTO(aPriorityOB.getId(),aPriorityOB.getTechDate(),aPriorityOB.getName(),aPriorityOB.getResponseTime());
    }
    public static PriorityOB converterPriorityDTOtoOB(PriorityDTO aPriorityDTO){
        if (aPriorityDTO == null) return null;
        return new PriorityOB(aPriorityDTO.getId(),aPriorityDTO.getTechDate(),aPriorityDTO.getName(),aPriorityDTO.getResponseTime());
    }
//PriorityLists
    public static List<PriorityDTO> converterPriorityListOBtoDTO(List<PriorityOB> aPriorityListOB){
        if (aPriorityListOB == null) return null;
        List<PriorityDTO> temp = new ArrayList<PriorityDTO>();

        for (PriorityOB element : aPriorityListOB){
            temp.add(converterPriorityOBtoDTO(element));
        }
        return temp;
    }

    public static List<PriorityOB> converterPriorityListDTOtoOB(List<PriorityDTO> aPriorityListDTO) {
        if (aPriorityListDTO == null) return null;
        List<PriorityOB> temp = new ArrayList<PriorityOB>();

        for (PriorityDTO element : aPriorityListDTO) {
            temp.add(converterPriorityDTOtoOB(element));
        }
        return temp;
    }
}