package com.uwm.projektz.attachment.api;

import com.uwm.projektz.MyServerException;
import com.uwm.projektz.attachment.dto.AttachmentDTO;
import com.uwm.projektz.attachment.dto.AttachmentDTOCreate;
import com.uwm.projektz.attachment.service.IAttachmentSerivce;
import com.uwm.projektz.enums.Type;
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
@RequestMapping(value="/projektz/attachments")
public class AttachmentController {

    @Autowired
    IAttachmentSerivce attachmentSerivce;

    @RequestMapping(value ="/saveAttachment", method = RequestMethod.POST,consumes ="application/json", produces = "application/json")
    @ResponseBody
    public ResponseEntity<AttachmentDTO> saveAttachment(@RequestBody AttachmentDTOCreate aAttachmentDTO){
        try {
            return new ResponseEntity<>(attachmentSerivce.saveAttachment(aAttachmentDTO), HttpStatus.OK);
        }catch (MyServerException e){
            return new ResponseEntity<>(e.getHeaders(),e.getStatus());
        }
    }

    @RequestMapping(value = "/getAttachmentById/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<AttachmentDTO> findAttachmentById(@PathVariable("id") Long aId){
        return new ResponseEntity<>(attachmentSerivce.findAttachmentById(aId), HttpStatus.OK);
    }

    @RequestMapping(value = "/getAllAtachments", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<AttachmentDTO>> findAttachments(){
        return new ResponseEntity<>(attachmentSerivce.findAllAttachment(), HttpStatus.OK);
    }

    @RequestMapping(value = "/getByName/{name}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<AttachmentDTO>> findAttachmentsByName(@PathVariable("name")String aName){
        return new ResponseEntity<>(attachmentSerivce.findAttachmentByName(aName), HttpStatus.OK);
    }


    @RequestMapping(value = "/getByMineType/{mine_type}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<AttachmentDTO>> findAttachmentsByMineType(@PathVariable("mine_type")String aMineType){
        return new ResponseEntity<>(attachmentSerivce.findAttachmentByMineType(aMineType), HttpStatus.OK);
    }

    @RequestMapping(value = "/getByFileName/{file_name}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<AttachmentDTO>> findAttachmentsByFileName(@PathVariable("file_name")String aFileName){
        return new ResponseEntity<>(attachmentSerivce.findAAtachmentsByFileName(aFileName), HttpStatus.OK);
    }

    @RequestMapping(value = "/getByMineTypeAndName/{mine_type},{name}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<AttachmentDTO>> findAAtachemntByMineTypeAndName(@PathVariable("mine_type")String aMineType,@PathVariable("name") String aName){
        return new ResponseEntity<>(attachmentSerivce.findAAtachemntByMineTypeAndName(aMineType,aName), HttpStatus.OK);
    }

    @RequestMapping(value = "/getByType/{type}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<AttachmentDTO>> findAttachmentByType(@PathVariable("type") Type aType){
        return new ResponseEntity<>(attachmentSerivce.findAttachmentByType(aType), HttpStatus.OK);
    }

    @RequestMapping(value= "/removAttachmentById/{id}",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Void> deleteAttachment(@PathVariable("id")Long aId)
    {
        attachmentSerivce.deleteAttachmentById(aId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
