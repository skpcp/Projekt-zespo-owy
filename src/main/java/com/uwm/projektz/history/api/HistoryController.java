package com.uwm.projektz.history.api;

import com.uwm.projektz.MyServerException;
import com.uwm.projektz.base.dto.ResponseDTO;
import com.uwm.projektz.history.dto.*;
import com.uwm.projektz.history.service.IHistoryService;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */

@RestController
@RequestMapping("/projektz/histories")
public class HistoryController {
    @Autowired
    IHistoryService historyService;


    @RequestMapping(value = "getById/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<HistoryDTO> findHistoryById(@PathVariable("id") Long aId){
        return new ResponseEntity<>(historyService.findHistoryById(aId), HttpStatus.OK);
    }

    @RequestMapping(value="/getAll", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<HistoryDTO>> findAllHistory(){
        return new ResponseEntity<>(historyService.findAllHistory(),HttpStatus.OK);
    }


    @RequestMapping(value="/getByUser/{user.id}",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<HistoryDTO>> findHistoryByUser(@PathVariable("user.id") Long aId){
        return new ResponseEntity<>(historyService.findHistoryByUser(aId),HttpStatus.OK);
    }

    @RequestMapping(value="/getByDate/{date}",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<HistoryDTO>> findHistoryByDate(@PathVariable("date") Date aDate){
        return new ResponseEntity<>(historyService.findHistoryByDate(aDate),HttpStatus.OK);
    }


    @RequestMapping(value="/getByUserAndDate/{date},{user.id}",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<HistoryDTO>> findByUserAndDate( @PathVariable("date") Date aDate,@PathVariable("user.id") Long aId){
        return new ResponseEntity<>(historyService.findHistoryByDateAndUser(aDate, aId),HttpStatus.OK);
    }


    @RequestMapping(value ="/saveHistory", method = RequestMethod.POST,consumes ="application/json", produces = "application/json")
    @ResponseBody
    public ResponseEntity<HistoryDTO> saveHistory(@RequestBody HistoryDTOString aHistory){
        Date date = new Date();
        HistoryDTOWithoutAttachment pHistoryDTO = new HistoryDTOWithoutAttachment(aHistory.getId(),aHistory.getType(),aHistory.getUser(),aHistory.getDescription(),date);
        try{
        return new ResponseEntity<>(historyService.saveHistory(pHistoryDTO),HttpStatus.OK);
        }catch (MyServerException e){
            return new ResponseEntity<>(e.getHeaders(),e.getStatus());
        }
    }

    @RequestMapping(value ="/saveHistoryWithAttachments", method = RequestMethod.POST,consumes ="application/json", produces = "application/json")
    @ResponseBody
    public ResponseEntity<HistoryDTO> saveHistoryWithAttachments(@RequestBody HistoryDTOStringWithAttachments aHistory){
        Date date = new Date();
        HistoryDTOAttachments pHistoryDTO = new HistoryDTOAttachments(aHistory.getId(),aHistory.getType(),aHistory.getUser(),aHistory.getDescription(),date,aHistory.getAttachments());
        try{
            return new ResponseEntity<>(historyService.saveHistoryWithAttachments(pHistoryDTO),HttpStatus.OK);
        }catch (MyServerException e){
            return new ResponseEntity<>(e.getHeaders(),e.getStatus());
        }
    }


    @RequestMapping(value= "/removeHistoryById/{id}",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<ResponseDTO> deleteHistory(@PathVariable("id")Long aId)
    {
        try {
            historyService.deleteHistoryById(aId);
            return new ResponseEntity<>(new ResponseDTO("history removed"),HttpStatus.OK);
        } catch (MyServerException e) {
            return new ResponseEntity<ResponseDTO>(e.getHeaders(),e.getStatus());
        }

    }


}
