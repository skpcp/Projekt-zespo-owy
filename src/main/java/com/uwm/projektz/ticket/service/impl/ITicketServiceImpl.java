package com.uwm.projektz.ticket.service.impl;

import com.uwm.projektz.attachment.dto.AttachmentDTO;
import com.uwm.projektz.enums.TicketType;
import com.uwm.projektz.enums.Type;
import com.uwm.projektz.history.dto.HistoryDTO;
import com.uwm.projektz.priority.dto.PriorityDTO;
import com.uwm.projektz.project.dto.ProjectDTO;
import com.uwm.projektz.ticket.dto.TicketDTO;
import com.uwm.projektz.ticket.service.ITicketService;
import com.uwm.projektz.user.dto.UserDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */

@Service
@Transactional
public class ITicketServiceImpl implements ITicketService {

    @Override
    public TicketDTO saveTicket(TicketDTO aTicketDTO) {
        return null;
    }

    @Override
    public TicketDTO findTicketById(Long aId) {
        return null;
    }

    @Override
    public List<TicketDTO> findByTicketsType(TicketType aTicketType) {
        return null;
    }

    @Override
    public List<TicketDTO> findByType(Type aType) {
        return null;
    }

    @Override
    public List<TicketDTO> findTicketsByUser(UserDTO aUserDTO) {
        return null;
    }

    @Override
    public List<TicketDTO> findTicketsByPriority(PriorityDTO aPriorityDTO) {
        return null;
    }

    @Override
    public List<TicketDTO> findTicketsByProjects(ProjectDTO aProjectDTO) {
        return null;
    }

    @Override
    public TicketDTO updateDescriptionForTicket(Long aId, String aDescription) {
        return null;
    }

    @Override
    public TicketDTO updateHistoryTicket(Long aId, HistoryDTO aHistoryDTO) {
        return null;
    }

    @Override
    public TicketDTO updateAttachemntForTicket(Long aId, AttachmentDTO aAtachmentDTO) {
        return null;
    }

    @Override
    public TicketDTO updateTicketTypeAndKind(Long aId, TicketType aTicketType, Type aKind) {
        return null;
    }

    @Override
    public void deletTicketById(Long aId) {

    }

    @Override
    public List<TicketDTO> findAll() {
        return null;
    }
}
