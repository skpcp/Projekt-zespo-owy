package com.uwm.projektz.attachment.converter;

import com.uwm.projektz.attachment.dto.AttachmentDTO;
import com.uwm.projektz.attachment.dto.AttachmentDTOCreate;
import com.uwm.projektz.attachment.ob.AttachmentOB;
import com.uwm.projektz.binary.converter.BinaryConverter;
import com.uwm.projektz.user.converter.UserConverter;

import java.util.ArrayList;
import java.util.List;


public class AttachmentConverter {


//Attachment
    public static AttachmentDTO converterAttachmentOBtoDTO(AttachmentOB aAttachmentOB) {
        if (aAttachmentOB == null) return null;
        return new AttachmentDTO(aAttachmentOB.getId(),aAttachmentOB.getTechDate(),aAttachmentOB.getType(),aAttachmentOB.getName(),aAttachmentOB.getFile_name(),aAttachmentOB.getMine_type(), BinaryConverter.converterBinaryOBtoDTO((aAttachmentOB.getBinary())));
    }

    public static AttachmentOB converterAttachmentDTOCreateToAttachmentOB(AttachmentDTOCreate aAttachmentDTO){
        if(aAttachmentDTO == null) return null;
        return new AttachmentOB(aAttachmentDTO.getType(),aAttachmentDTO.getName(),aAttachmentDTO.getFile_name(),aAttachmentDTO.getMine_type());
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



}