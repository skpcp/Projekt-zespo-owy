package com.uwm.projektz.attachment.api;

import com.uwm.projektz.MyServerException;
import com.uwm.projektz.attachment.dto.AttachmentDTO;
import com.uwm.projektz.attachment.dto.AttachmentDTOCreate;
import com.uwm.projektz.attachment.service.IAttachmentSerivce;
import com.uwm.projektz.base.dto.ResponseDTO;
import com.uwm.projektz.enums.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */

@RestController
@RequestMapping(value="/projektz/attachments")
public class AttachmentController {

    @Autowired
    IAttachmentSerivce attachmentService;

    @RequestMapping(value ="/saveAttachment", method = RequestMethod.POST,consumes ="application/json", produces = "application/json")
    @ResponseBody
    public ResponseEntity<AttachmentDTO> saveAttachment(@RequestBody AttachmentDTOCreate aAttachmentDTO){
        try {
            return new ResponseEntity<>(attachmentService.saveAttachment(aAttachmentDTO), HttpStatus.OK);
        }catch (MyServerException e){
            return new ResponseEntity<>(e.getHeaders(),e.getStatus());
        }
    }

    @RequestMapping(value = "/getAttachmentById/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<AttachmentDTO> findAttachmentById(@PathVariable("id") Long aId){
        return new ResponseEntity<>(attachmentService.findAttachmentById(aId), HttpStatus.OK);
    }

    @RequestMapping(value = "/getAllAtachments", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<AttachmentDTO>> findAttachments(){
        return new ResponseEntity<>(attachmentService.findAllAttachment(), HttpStatus.OK);
    }

    @RequestMapping(value = "/getByName/{name}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<AttachmentDTO>> findAttachmentsByName(@PathVariable("name")String aName){
        return new ResponseEntity<>(attachmentService.findAttachmentByName(aName), HttpStatus.OK);
    }


    @RequestMapping(value = "/getByMineType/{mine_type}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<AttachmentDTO>> findAttachmentsByMineType(@PathVariable("mine_type")String aMineType){
        return new ResponseEntity<>(attachmentService.findAttachmentByMineType(aMineType), HttpStatus.OK);
    }

    @RequestMapping(value = "/getByFileName/{file_name}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<AttachmentDTO>> findAttachmentsByFileName(@PathVariable("file_name")String aFileName){
        return new ResponseEntity<>(attachmentService.findAAtachmentsByFileName(aFileName), HttpStatus.OK);
    }

    @RequestMapping(value = "/getByMineTypeAndName/{mine_type},{name}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<AttachmentDTO>> findAAtachemntByMineTypeAndName(@PathVariable("mine_type")String aMineType,@PathVariable("name") String aName){
        return new ResponseEntity<>(attachmentService.findAAtachemntByMineTypeAndName(aMineType,aName), HttpStatus.OK);
    }

    @RequestMapping(value = "/getByType/{type}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<AttachmentDTO>> findAttachmentByType(@PathVariable("type") Type aType){
        return new ResponseEntity<>(attachmentService.findAttachmentByType(aType), HttpStatus.OK);
    }

    @RequestMapping(value= "/removeAttachmentById/{id}",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<ResponseDTO> deleteAttachment(@PathVariable("id")Long aId)
    {
        try {
            attachmentService.deleteAttachmentById(aId) ;
            return new ResponseEntity<>(new ResponseDTO("Attachment removed"),HttpStatus.OK);
        } catch (MyServerException e) {
           return new ResponseEntity<ResponseDTO>(e.getHeaders(),e.getStatus());
        }

    }

}
