package com.uwm.projektz.ticket.service;

import com.uwm.projektz.attachment.dto.AttachmentDTO;
import com.uwm.projektz.enums.TicketType;
import com.uwm.projektz.enums.Type;
import com.uwm.projektz.history.dto.HistoryDTO;
import com.uwm.projektz.priority.dto.PriorityDTO;
import com.uwm.projektz.project.dto.ProjectDTO;
import com.uwm.projektz.ticket.dto.TicketDTO;
import com.uwm.projektz.user.dto.UserDTO;

import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */
public interface ITicketService {

    //CREATE & UPDATE
    TicketDTO saveTicket(TicketDTO aTicketDTO);


    //READ
    TicketDTO findTicketById(Long aId);
    List<TicketDTO> findAll();
    List<TicketDTO> findByTicketsType(TicketType aKind);
    List<TicketDTO> findByType(Type aType);
    List<TicketDTO> findTicketsByUser(UserDTO aUserDTO);
    List<TicketDTO> findTicketsByPriority(PriorityDTO aPriorityDTO);
    List<TicketDTO> findTicketsByProjects(ProjectDTO aProjectDTO);


    //UPDATE
    TicketDTO updateDescriptionForTicket(Long aId, String aDescription);
    TicketDTO updateHistoryTicket(Long aId, HistoryDTO aHistoryDTO);
    TicketDTO updateAttachemntForTicket(Long aId, AttachmentDTO aAtachmentDTO);
    TicketDTO updateTicketTypeAndKind(Long aId,TicketType aTicketType, Type aKind);

    //DELETE
    void deletTicketById(Long aId);
}
