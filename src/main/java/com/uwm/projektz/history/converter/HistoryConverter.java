package com.uwm.projektz.history.converter;

import com.uwm.projektz.attachment.converter.AttachmentConverter;
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
import com.uwm.projektz.user.converter.UserConverter;
import com.uwm.projektz.user.dto.UserDTO;
import com.uwm.projektz.user.ob.UserOB;

import java.util.ArrayList;
import java.util.List;


public class HistoryConverter {


//History
    public static HistoryDTO converterHistoryOBtoDTO(HistoryOB aHistoryOB){
        if (aHistoryOB == null) return null;
        return new HistoryDTO(aHistoryOB.getId(),aHistoryOB.getTechDate(),aHistoryOB.getType(), UserConverter.converterUserOBtoUserDTOMd5pass(aHistoryOB.getUser()),aHistoryOB.getDescription(),aHistoryOB.getDate(), AttachmentConverter.converterAttachmentListOBtoDTO(aHistoryOB.getAttachments()));
    }

    public static HistoryOB converterHistoryDTOtoOB(HistoryDTO aHistoryDTO){
        if (aHistoryDTO == null) return null;
        return new HistoryOB(aHistoryDTO.getId(),aHistoryDTO.getTechDate(),aHistoryDTO.getType(),UserConverter.converterUserDTOWithoutMd5PassToUserOB(aHistoryDTO.getUser()),aHistoryDTO.getDescription(),aHistoryDTO.getDate(),AttachmentConverter.converterAttachmentListDTOtoOB(aHistoryDTO.getAttachments()));
    }
//HistoryList
    public static List<HistoryDTO> converterHistoryListOBtoDTO(List<HistoryOB> aHistoryOBList){
        if (aHistoryOBList == null) return null;
        List<HistoryDTO> temp = new ArrayList<HistoryDTO>();

        for (HistoryOB element : aHistoryOBList){
            temp.add(converterHistoryOBtoDTO(element));
        }
        return temp;
    }

    public static List<HistoryOB> converterHistoryListDTOtoOB(List<HistoryDTO> aHistoryDTOList){
        if (aHistoryDTOList == null) return null;
        List<HistoryOB> temp = new ArrayList<HistoryOB>();

        for (HistoryDTO element : aHistoryDTOList){
            temp.add(converterHistoryDTOtoOB(element));
        }
        return temp;
    }


}