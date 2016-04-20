package com.uwm.projektz.ticket.api;

import com.uwm.projektz.attachment.dto.AttachmentDTO;
import com.uwm.projektz.enums.TicketType;
import com.uwm.projektz.enums.Type;
import com.uwm.projektz.history.dto.HistoryDTO;
import com.uwm.projektz.priority.dto.PriorityDTO;
import com.uwm.projektz.project.dto.ProjectDTO;
import com.uwm.projektz.ticket.dto.TicketDTO;
import com.uwm.projektz.ticket.service.ITicketService;
import com.uwm.projektz.user.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Path;
import java.util.List;


/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */
@RestController
@Transactional
@RequestMapping(value = "/projektz/tickets")
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

    @RequestMapping(value="/getTicketstByUser/{user}",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<TicketDTO>> findTicketsByUser(@RequestBody UserDTO aUserDTO){
        return new ResponseEntity<>(ticketService.findTicketsByUser(aUserDTO),HttpStatus.OK);
    }

    @RequestMapping(value="/getTicketsByProject/{project}",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<TicketDTO>> findTicketsByProject(@RequestBody ProjectDTO aProjectDTO){
        return new ResponseEntity<>(ticketService.findTicketsByProjects(aProjectDTO),HttpStatus.OK);
    }

    @RequestMapping(value="/getTicketsByPriority/{priority}",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<TicketDTO>> findTicketsByPriority(@RequestBody PriorityDTO aPriorityDTO){
        return new ResponseEntity<>(ticketService.findTicketsByPriority(aPriorityDTO),HttpStatus.OK);
    }




    @RequestMapping(value="/saveTicket",method = RequestMethod.POST, consumes ="application/json", produces = "application/json")
    @ResponseBody
    public ResponseEntity<TicketDTO> saveTicket(@RequestBody TicketDTO aTicketDTO){
        return new ResponseEntity<>(ticketService.saveTicket(aTicketDTO),HttpStatus.OK);
    }

    //update

    @RequestMapping(value = "/changeDescriptionToTicket/{id},{description}",method = RequestMethod.POST,consumes = "aplication/json",produces = "appliaction/json")
    @ResponseBody
    public ResponseEntity<TicketDTO> updateDescriptionForTicket(@PathVariable("id")Long aId,@PathVariable("description") String aDescription){
        return  new ResponseEntity<>(ticketService.updateDescriptionForTicket(aId,aDescription),HttpStatus.OK);
    }

    @RequestMapping(value="/addAttachmentToTicket/{id}", method = RequestMethod.POST,consumes = "aplication/json",produces = "appliaction/json")
    @ResponseBody
    public ResponseEntity<TicketDTO> updateAttachmentForTciket(@PathVariable("id") Long aId, @RequestBody AttachmentDTO aAttachmentDTO){
        return new ResponseEntity<>(ticketService.updateAttachemntForTicket(aId, aAttachmentDTO),HttpStatus.OK);
    }

    @RequestMapping(value="/addHistoryToTicket/{id}", method = RequestMethod.POST,consumes = "aplication/json",produces = "appliaction/json")
    @ResponseBody
    public ResponseEntity<TicketDTO> updateHistoryForTicket(@PathVariable("id") Long aId, @RequestBody HistoryDTO aHistoryDTO){
        return new ResponseEntity<>(ticketService.updateHistoryTicket(aId, aHistoryDTO),HttpStatus.OK);
    }

    @RequestMapping(value="/changeTicketTypeAndTypeFor/{id},{kind},{type}", method = RequestMethod.POST,consumes = "aplication/json",produces = "appliaction/json")
    @ResponseBody
    public ResponseEntity<TicketDTO> updateTicketTypeAndTypeForTicket(@PathVariable("id") Long aId, @PathVariable("kind") TicketType aKind,@PathVariable("type") Type aType){
       return new ResponseEntity<>(ticketService.updateTicketTypeAndKind(aId,aKind,aType),HttpStatus.OK);

    }


    @RequestMapping(value="/removeTicketById/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public ResponseEntity<TicketDTO> deleteTicket(@PathVariable("id") Long aId){
        ticketService.deletTicketById(aId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
