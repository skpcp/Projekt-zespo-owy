package com.uwm.projektz.attachment.converter;

import com.uwm.projektz.attachment.dto.AttachmentDTO;
import com.uwm.projektz.attachment.ob.AttachmentOB;
import com.uwm.projektz.binary.converter.BinaryConverter;
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


public class AttachmentConverter {


//Attachment
    public static AttachmentDTO converterAttachmentOBtoDTO(AttachmentOB aAttachmentOB) {
        if (aAttachmentOB == null) return null;
        return new AttachmentDTO(aAttachmentOB.getId(),aAttachmentOB.getTechDate(),aAttachmentOB.getType(),aAttachmentOB.getName(),aAttachmentOB.getFile_name(),aAttachmentOB.getMine_type(), BinaryConverter.converterBinaryOBtoDTO((aAttachmentOB.getBinary())), UserConverter.converterUserOBtoUserDTOMd5pass(aAttachmentOB.getUser()));
    }

    public static AttachmentOB converterAttachmentDTOtoOB(AttachmentDTO aAttachmentDTO){
        if (aAttachmentDTO == null) return null;
        return new AttachmentOB(aAttachmentDTO.getId(),aAttachmentDTO.getTechDate(),aAttachmentDTO.getType(),aAttachmentDTO.getName(),aAttachmentDTO.getFile_name(),aAttachmentDTO.getMine_type(),BinaryConverter.converterBinaryDTOtoOB(aAttachmentDTO.getBinary()),UserConverter.converterUserDTOWithoutMd5PassToUserOB(aAttachmentDTO.getUser()));
    }



//Listy
    public static List<AttachmentDTO> converterAttachmentListOBtoDTO(List<AttachmentOB> aAttachmentOBList){
        if (aAttachmentOBList == null) return null;
        List<AttachmentDTO> temp = new ArrayList<AttachmentDTO>();

        for (AttachmentOB element : aAttachmentOBList)
        {
            temp.add(converterAttachmentOBtoDTO(element));
        }

        return temp;
    }

    public static List<AttachmentOB> converterAttachmentListDTOtoOB(List<AttachmentDTO> aAttachmentDTOList){
        if (aAttachmentDTOList == null) return null;
        List<AttachmentOB> temp = new ArrayList<AttachmentOB>();

        for (AttachmentDTO element : aAttachmentDTOList)
        {
            temp.add(converterAttachmentDTOtoOB(element));
        }
        return temp;
    }

}