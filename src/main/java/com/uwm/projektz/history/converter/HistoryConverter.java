package com.uwm.projektz.history.converter;

import com.uwm.projektz.attachment.converter.AttachmentConverter;
import com.uwm.projektz.history.dto.HistoryDTO;
import com.uwm.projektz.history.dto.HistoryDTOAttachments;
import com.uwm.projektz.history.dto.HistoryDTOWithoutAttachment;
import com.uwm.projektz.history.ob.HistoryOB;
import com.uwm.projektz.user.converter.UserConverter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


public class HistoryConverter {


//History
    public static HistoryDTO converterHistoryOBtoDTO(HistoryOB aHistoryOB){
        if (aHistoryOB == null) return null;
        SimpleDateFormat dzienFromat = new SimpleDateFormat("YYYY-MM-dd");
        String dzien = dzienFromat.format(aHistoryOB.getDate());
        return new HistoryDTO(aHistoryOB.getId(),aHistoryOB.getTechDate(),aHistoryOB.getType(), UserConverter.converterUserOBtoUserDTO(aHistoryOB.getUser()),aHistoryOB.getDescription(),dzien, AttachmentConverter.converterAttachmentListOBtoDTO(aHistoryOB.getAttachments()));
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

    public  static HistoryOB converterHistoryDTOWithoutAttachmentToHistoryOB(HistoryDTOWithoutAttachment aHistoryDTO){
        if(aHistoryDTO == null){
            return null;
        }
        return new HistoryOB(aHistoryDTO.getType(),aHistoryDTO.getDescription());
    }

    public static HistoryOB converterHistoryDTOAttachmentsToHistoryOB(HistoryDTOAttachments aHitoryDTO){
        if(aHitoryDTO == null) return null;
        return new HistoryOB(aHitoryDTO.getType(),aHitoryDTO.getDescription());
    }



}