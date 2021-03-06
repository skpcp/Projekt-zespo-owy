package com.uwm.projektz.priority.api;

import com.uwm.projektz.MyServerException;
import com.uwm.projektz.base.dto.ResponseDTO;
import com.uwm.projektz.priority.dto.PriorityDTO;
import com.uwm.projektz.priority.dto.PriorityDTOCreate;
import com.uwm.projektz.priority.dto.PriorityDTOUpdateName;
import com.uwm.projektz.priority.service.IPriorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */


@RestController
@RequestMapping(value = "/projektz/priorities")
public class PriorityController {

    @Autowired
    IPriorityService priorityService;

    @RequestMapping(value = "getProitiesById/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<PriorityDTO> findPriorityById(@PathVariable("id") Long aId){
        return new ResponseEntity<>(priorityService.findPriorityById(aId), HttpStatus.OK);
    }

    @RequestMapping(value="/getAll", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<PriorityDTO>> findAllPriorities(){
        return new ResponseEntity<>(priorityService.findAllPriorities(),HttpStatus.OK);
    }

    @RequestMapping(value="/getByName/{name}",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<PriorityDTO> findPriorityByName(@PathVariable("name") String aName){
        return new ResponseEntity<>(priorityService.findByName(aName),HttpStatus.OK);
    }

    @RequestMapping(value ="/savePriority", method = RequestMethod.POST,consumes ="application/json", produces = "application/json")
    @ResponseBody
    public ResponseEntity<PriorityDTO> savePriority(@RequestBody PriorityDTOCreate aPriority){
        return new ResponseEntity<>(priorityService.savePriority(aPriority),HttpStatus.OK);
    }
//
    @RequestMapping(value= "/removePriority/{id}",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<ResponseDTO> deletePriority(@PathVariable("id")Long aId)
    {
        try {
            priorityService.deletePriority(aId);
            return new ResponseEntity<>(new ResponseDTO("Priority removed"),HttpStatus.OK);
        } catch (MyServerException e) {
            return new ResponseEntity<>(e.getHeaders(),e.getStatus());
        }

    }

    @RequestMapping(value = "/changePriorityName",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<PriorityDTO> updatePriorityName(@RequestBody PriorityDTOUpdateName aProrityDTO){
        try{
            return new ResponseEntity<>(priorityService.changePriortyName(aProrityDTO),HttpStatus.OK);
        }catch (MyServerException e){
            return new ResponseEntity<>(e.getHeaders(),e.getStatus());
        }
    }
}
