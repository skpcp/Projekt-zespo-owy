package com.uwm.projektz.ticket.converter;

import com.uwm.projektz.attachment.converter.AttachmentConverter;
import com.uwm.projektz.history.converter.HistoryConverter;
import com.uwm.projektz.priority.converter.PriorityConverter;
import com.uwm.projektz.project.converter.ProjectConverter;
import com.uwm.projektz.ticket.dto.TicketDTO;
import com.uwm.projektz.ticket.ob.TicketOB;
import com.uwm.projektz.user.converter.UserConverter;

import java.util.ArrayList;
import java.util.List;


public class TicketConverter {


//Ticket
    public static TicketDTO converterTicketOBtoDTO(TicketOB aTicketOB){
        if (aTicketOB == null) return null;
        return new TicketDTO(aTicketOB.getId(),aTicketOB.getTechDate(),aTicketOB.getKind(),aTicketOB.getType(),aTicketOB.getDescription(), UserConverter.converterUserOBtoUserDTO(aTicketOB.getUser()), PriorityConverter.converterPriorityOBtoDTO(aTicketOB.getPriority()), ProjectConverter.converterProjectOBtoDTO(aTicketOB.getProject()), HistoryConverter.converterHistoryListOBtoDTO(aTicketOB.getHistories()), AttachmentConverter.converterAttachmentListOBtoDTO(aTicketOB.getAttachments()));
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


}