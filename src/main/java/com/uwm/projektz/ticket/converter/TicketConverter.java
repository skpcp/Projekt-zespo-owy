package com.uwm.projektz.ticket.converter;

import com.uwm.projektz.attachment.converter.AttachmentConverter;
import com.uwm.projektz.attachment.dto.AttachmentDTO;
import com.uwm.projektz.attachment.ob.AttachmentOB;
import com.uwm.projektz.binary.dto.BinaryDTO;
import com.uwm.projektz.binary.ob.BinaryOB;
import com.uwm.projektz.history.converter.HistoryConverter;
import com.uwm.projektz.history.dto.HistoryDTO;
import com.uwm.projektz.history.ob.HistoryOB;
import com.uwm.projektz.permission.dto.PermissionDTO;
import com.uwm.projektz.permission.ob.PermissionOB;
import com.uwm.projektz.priority.converter.PriorityConverter;
import com.uwm.projektz.priority.dto.PriorityDTO;
import com.uwm.projektz.priority.ob.PriorityOB;
import com.uwm.projektz.project.converter.ProjectConverter;
import com.uwm.projektz.project.dto.ProjectDTO;
import com.uwm.projektz.project.ob.ProjectOB;
import com.uwm.projektz.role.dto.RoleDTO;
import com.uwm.projektz.role.ob.RoleOB;
import com.uwm.projektz.ticket.dto.TicketDTO;
import com.uwm.projektz.ticket.ob.TicketOB;
import com.uwm.projektz.user.converter.UserConverter;
import com.uwm.projektz.user.dto.UserDTO;
import com.uwm.projektz.user.ob.UserOB;

import java.util.ArrayList;
import java.util.List;


public class TicketConverter {


//Ticket
    public static TicketDTO converterTicketOBtoDTO(TicketOB aTicketOB){
        if (aTicketOB == null) return null;
        return new TicketDTO(aTicketOB.getId(),aTicketOB.getTechDate(),aTicketOB.getKind(),aTicketOB.getType(),aTicketOB.getDescription(), UserConverter.converterUserOBtoUserDTOMd5pass(aTicketOB.getUser()), PriorityConverter.converterPriorityOBtoDTO(aTicketOB.getPriority()), ProjectConverter.converterProjectOBtoDTO(aTicketOB.getProject()), HistoryConverter.converterHistoryListOBtoDTO(aTicketOB.getHistories()), AttachmentConverter.converterAttachmentListOBtoDTO(aTicketOB.getAttachments()));
    }

    public static TicketOB converterTicketDTOtoOB(TicketDTO aTicketDTO) {
        if (aTicketDTO == null) return null;
        return new TicketOB(aTicketDTO.getId(), aTicketDTO.getTechDate(), aTicketDTO.getKind(), aTicketDTO.getType(), aTicketDTO.getDescription(), UserConverter.converterUserDTOWithoutMd5PassToUserOB(aTicketDTO.getUser()), PriorityConverter.converterPriorityDTOtoOB(aTicketDTO.getPriority()), ProjectConverter.converterProjectDTOtoOB(aTicketDTO.getProject()), HistoryConverter.converterHistoryListDTOtoOB(aTicketDTO.getHistories()), AttachmentConverter.converterAttachmentListDTOtoOB(aTicketDTO.getAttachments()));
    }
//TicketLists
    public static List<TicketDTO> converterTicketListOBtoDTO (List<TicketOB> aTicketListOB){
        if (aTicketListOB == null) return null;
        List<TicketDTO> temp = new ArrayList<TicketDTO>();

        for (TicketOB element : aTicketListOB){
            temp.add(converterTicketOBtoDTO(element));
        }
        return temp;
    }

    public static List<TicketOB> converterTicketListDTOtoOB (List<TicketDTO> aTicketListDTO){
        if (aTicketListDTO == null) return null;
        List<TicketOB> temp = new ArrayList<TicketOB>();

        for (TicketDTO element : aTicketListDTO){
            temp.add(converterTicketDTOtoOB(element));
        }
        return temp;
    }

}