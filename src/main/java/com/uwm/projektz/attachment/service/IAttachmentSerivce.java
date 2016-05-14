package com.uwm.projektz.attachment.service;

import com.uwm.projektz.MyServerException;
import com.uwm.projektz.attachment.dto.AttachmentDTO;
import com.uwm.projektz.attachment.dto.AttachmentDTOCreate;
import com.uwm.projektz.enums.Type;

import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */
public interface IAttachmentSerivce {
    //CREATE & UPDATE
    AttachmentDTO saveAttachment(AttachmentDTOCreate aAttachmentDTO) throws MyServerException;

    //READ
    AttachmentDTO findAttachmentById(Long aId);
    List<AttachmentDTO> findAllAttachment();
    List<AttachmentDTO> findAttachmentByName(String aName);
    List<AttachmentDTO> findAAtachmentsByFileName(String aFile_Name);
    List<AttachmentDTO> findAttachmentByMineType(String aMineType);
    List<AttachmentDTO> findAAtachemntByMineTypeAndName(String aMineType,String aName);
    List<AttachmentDTO> findAttachmentByType(Type aType);
    //DELETE
    void deleteAttachmentById(Long aId);

}
