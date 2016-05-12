package com.uwm.projektz.history.api;

import com.uwm.projektz.MyServerException;
import com.uwm.projektz.history.dto.HistoryDTO;
import com.uwm.projektz.history.dto.HistoryDTOWithoutAttachment;
import com.uwm.projektz.history.service.IHistoryService;
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
@Transactional
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
    public ResponseEntity<HistoryDTO> saveHistory(@RequestBody HistoryDTOWithoutAttachment aHistory){
        try{
        return new ResponseEntity<>(historyService.saveHistory(aHistory),HttpStatus.OK);
        }catch (MyServerException e){
            return new ResponseEntity<>(e.getHeaders(),e.getStatus());
        }
    }

    @RequestMapping(value= "/removeHistoryById/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public ResponseEntity<HistoryDTO> deleteHistory(@PathVariable("id")Long aId)
    {
        historyService.deleteHistoryById(aId);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
