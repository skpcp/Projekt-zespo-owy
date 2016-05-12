package com.uwm.projektz.binary.converter;

import com.uwm.projektz.attachment.dto.AttachmentDTO;
import com.uwm.projektz.attachment.ob.AttachmentOB;
import com.uwm.projektz.binary.dto.BinaryDTO;
import com.uwm.projektz.binary.dto.BinaryDTOId;
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


public class BinaryConverter {
//Binary
    public static BinaryDTO converterBinaryOBtoDTO(BinaryOB aBinaryOB)
    {
        if (aBinaryOB == null) return null;

        return new BinaryDTO(aBinaryOB.getId(),aBinaryOB.getTechDate(),aBinaryOB.getBinary());
    }

    public static BinaryOB converterBinaryDTOtoOB(BinaryDTO aBinaryDTO)
    {
        if (aBinaryDTO == null) return null;

        return new BinaryOB(aBinaryDTO.getId(),aBinaryDTO.getTechDate(),aBinaryDTO.getBinary());
    }

//BinaryLists
    public static List<BinaryDTO> converterBinaryListOBtoDTO(List<BinaryOB> aBinaryListOB){
        if (aBinaryListOB == null) return null;
        List<BinaryDTO> temp = new ArrayList<BinaryDTO>();
        for (BinaryOB element : aBinaryListOB){
            temp.add(converterBinaryOBtoDTO(element));
        }
        return temp;
    }
    public static List<BinaryOB> converterBinaryListDTOtoOB(List<BinaryDTO> aBinaryListDTO){
        if (aBinaryListDTO == null) return null;
        List<BinaryOB> temp = new ArrayList<BinaryOB>();
        for (BinaryDTO element : aBinaryListDTO){
            temp.add(converterBinaryDTOtoOB(element));
        }
        return temp;
    }

    public static BinaryDTOId converterBinaryOBtoBinaryDTOId(BinaryOB binaryOB){
        if(binaryOB == null) return null;
        return new BinaryDTOId(binaryOB.getId(),binaryOB.getTechDate());
    }
}