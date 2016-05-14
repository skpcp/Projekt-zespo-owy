package com.uwm.projektz.ticket.api;

import com.uwm.projektz.MyServerException;
import com.uwm.projektz.attachment.dto.AttachmentDTO;
import com.uwm.projektz.enums.TicketType;
import com.uwm.projektz.enums.Type;
import com.uwm.projektz.history.dto.HistoryDTO;
import com.uwm.projektz.priority.dto.PriorityDTO;
import com.uwm.projektz.ticket.dto.TicketDTO;
import com.uwm.projektz.ticket.dto.TicketDTOAttachments;
import com.uwm.projektz.ticket.dto.TicketDTOHistory;
import com.uwm.projektz.ticket.dto.TicketDTOWithoutHistoriesAttachments;
import com.uwm.projektz.ticket.service.ITicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.util.List;


/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */
@RestController
@RequestMapping("/projektz/tickets")
public class TicketController {

    @Autowired
    ITicketService ticketService;

    @RequestMapping(value="/getById/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<TicketDTO> findTicketById(@PathVariable("id")Long aId){
        return new ResponseEntity<>(ticketService.findTicketById(aId), HttpStatus.OK);
    }


    @RequestMapping(value="/getAll", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<TicketDTO>> findAllTickets(){
        return new ResponseEntity<>(ticketService.findAll(), HttpStatus.OK);
    }

    @RequestMapping(value="/getByTicketType/{kind}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<TicketDTO>> findTicketByTicketType(@PathVariable("kind")TicketType aKind){
        return new ResponseEntity<>(ticketService.findByTicketsType(aKind), HttpStatus.OK);
    }

    @RequestMapping(value="/getByType/{type}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<TicketDTO>> findTicketByType(@PathVariable("type")Type aType){
        return new ResponseEntity<>(ticketService.findByType(aType), HttpStatus.OK);
    }

    @RequestMapping(value="/getTicketstByUser/{user.id}",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<TicketDTO>> findTicketsByUser(@PathVariable("user.id") Long aId){
        return new ResponseEntity<>(ticketService.findTicketsByUser(aId),HttpStatus.OK);
    }

    @RequestMapping(value="/getTicketsByProject/{project.id}",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<TicketDTO>> findTicketsByProject(@PathVariable("project.id") Long aId ){
        return new ResponseEntity<>(ticketService.findTicketsByProject(aId),HttpStatus.OK);
    }

    @RequestMapping(value="/getTicketsByPriority/{priority.id}",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<TicketDTO>> findTicketsByPriority(@PathVariable Long aId){
        return new ResponseEntity<>(ticketService.findTicketsByPriority(aId),HttpStatus.OK);
    }


    @RequestMapping(value="/saveTicket",method = RequestMethod.POST, consumes ="application/json", produces = "application/json")
    @ResponseBody
    public ResponseEntity<TicketDTO> saveTicket(@RequestBody TicketDTOWithoutHistoriesAttachments aTicketDTO){
        try {
            return new ResponseEntity<>(ticketService.saveTicket(aTicketDTO), HttpStatus.OK);
        }catch (MyServerException e){
            return  new ResponseEntity<>(e.getHeaders(),e.getStatus());
        }
    }

    @RequestMapping(value="/saveTicketWithAttachments",method = RequestMethod.POST, consumes ="application/json", produces = "application/json")
    @ResponseBody
    public ResponseEntity<TicketDTO> saveTicketWithAttachments(@RequestBody TicketDTOAttachments aTicketDTO){
        try {
            return new ResponseEntity<>(ticketService.saveTcketWithAttachments(aTicketDTO), HttpStatus.OK);
        }catch (MyServerException e){
            return  new ResponseEntity<>(e.getHeaders(),e.getStatus());
        }
    }

    @RequestMapping(value="/removeTicketById/{id}",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Void> deleteTicket(@PathVariable("id") Long aId){
        ticketService.deletTicketById(aId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/addHistoryToTicket",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<TicketDTO> updateTicketHistory(@RequestBody TicketDTOHistory aTicketDTO){
        try {
            return new ResponseEntity<>(ticketService.updateHistoryTicket(aTicketDTO), HttpStatus.OK);
        }catch (MyServerException e){
            return  new ResponseEntity<>(e.getHeaders(),e.getStatus());
        }
    }
}
