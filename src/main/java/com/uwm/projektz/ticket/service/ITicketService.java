package com.uwm.projektz.ticket.service;

import com.uwm.projektz.MyServerException;
import com.uwm.projektz.attachment.dto.AttachmentDTO;
import com.uwm.projektz.enums.TicketType;
import com.uwm.projektz.enums.Type;
import com.uwm.projektz.history.dto.HistoryDTO;
import com.uwm.projektz.ticket.dto.TicketDTO;
import com.uwm.projektz.ticket.dto.TicketDTOAttachments;
import com.uwm.projektz.ticket.dto.TicketDTOHistory;
import com.uwm.projektz.ticket.dto.TicketDTOWithoutHistoriesAttachments;

import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */
public interface ITicketService {

    //CREATE & UPDATE
    TicketDTO saveTicket(TicketDTOWithoutHistoriesAttachments aTicketDTO) throws MyServerException;
    TicketDTO saveTcketWithAttachments(TicketDTOAttachments aTicketDTO) throws MyServerException;


    //READ
    TicketDTO findTicketById(Long aId);
    List<TicketDTO> findAll();
    List<TicketDTO> findByTicketsType(TicketType aKind);
    List<TicketDTO> findByType(Type aType);
    List<TicketDTO> findTicketsByUser(Long aId);
    List<TicketDTO> findTicketsByPriority(Long aId);
    List<TicketDTO> findTicketsByProject(Long aId);


    //UPDATE
    TicketDTO updateHistoryTicket(TicketDTOHistory aTicketDTO) throws MyServerException;


    //DELETE
    //attachemnty-z historia //historia z attachmentem  remove casscade
    void deletTicketById(Long aId);
}
