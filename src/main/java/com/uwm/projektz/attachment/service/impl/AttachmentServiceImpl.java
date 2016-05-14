package com.uwm.projektz.attachment.service.impl;

import com.uwm.projektz.MyServerException;
import com.uwm.projektz.attachment.converter.AttachmentConverter;
import com.uwm.projektz.attachment.dto.AttachmentDTO;
import com.uwm.projektz.attachment.dto.AttachmentDTOCreate;
import com.uwm.projektz.attachment.ob.AttachmentOB;
import com.uwm.projektz.attachment.repository.IAttachmentRepository;
import com.uwm.projektz.attachment.service.IAttachmentSerivce;
import com.uwm.projektz.binary.ob.BinaryOB;
import com.uwm.projektz.binary.repository.IBinaryRepository;
import com.uwm.projektz.enums.Type;
import com.uwm.projektz.user.ob.UserOB;
import com.uwm.projektz.user.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */
@Service
@Transactional
public class AttachmentServiceImpl implements IAttachmentSerivce {

    @Autowired
    IAttachmentRepository attachmentRepository;

    @Autowired
    IBinaryRepository binaryRepository;

    @Autowired
    IUserRepository userRepository;

    @Override
    public AttachmentDTO findAttachmentById(Long aId) {
        return AttachmentConverter.converterAttachmentOBtoDTO(attachmentRepository.findOne(aId));
    }

    @Override
    public List<AttachmentDTO> findAllAttachment() {
        return AttachmentConverter.converterAttachmentListOBtoDTO(attachmentRepository.findAll());
    }



    @Override
    public List<AttachmentDTO> findAttachmentByName(String aName) {
        List<AttachmentOB> attachments = attachmentRepository.findAttachmentByName(aName);
        return AttachmentConverter.converterAttachmentListOBtoDTO(attachments);
    }

    @Override
    public List<AttachmentDTO> findAAtachmentsByFileName(String aFile_Name) {
        List<AttachmentOB> attachments = attachmentRepository.findAttachmentByFileName(aFile_Name);
        return AttachmentConverter.converterAttachmentListOBtoDTO(attachments);
    }

    @Override
    public List<AttachmentDTO> findAttachmentByMineType(String aMineType) {
        List<AttachmentOB> attachments = attachmentRepository.findAttachmentByMineType(aMineType);
        return AttachmentConverter.converterAttachmentListOBtoDTO(attachments);
    }

    @Override
    public List<AttachmentDTO> findAAtachemntByMineTypeAndName(String aMineType, String aName) {
        List<AttachmentOB> attachments = attachmentRepository.findAttachmentByMineTypeAndName(aMineType,aName);
        return AttachmentConverter.converterAttachmentListOBtoDTO(attachments);
    }

    @Override
    public List<AttachmentDTO> findAttachmentByType(Type aType) {
        List<AttachmentOB> attachments = attachmentRepository.findAttachmentByType(aType);
        return AttachmentConverter.converterAttachmentListOBtoDTO(attachments);
    }

    @Override
    public void deleteAttachmentById(Long aId) {
        attachmentRepository.delete(aId);
    }

    @Override
    public AttachmentDTO saveAttachment(AttachmentDTOCreate aAttachmentDTO) throws MyServerException {
        BinaryOB binaryOB = aAttachmentDTO.getBinary() == null ? null : binaryRepository.findOne(aAttachmentDTO.getBinary());
        if(binaryOB == null) throw  new MyServerException("Binary not found",HttpStatus.NOT_FOUND);
        AttachmentOB attachmentOB = aAttachmentDTO.getId() == null ? null : attachmentRepository.findOne(aAttachmentDTO.getId());
        if(attachmentOB == null) {
            attachmentOB = AttachmentConverter.converterAttachmentDTOCreateToAttachmentOB(aAttachmentDTO);
            attachmentOB.setBinary(binaryOB);
            return AttachmentConverter.converterAttachmentOBtoDTO(attachmentRepository.save(attachmentOB));
        }
        attachmentOB.setTechDate(new Date());
        attachmentOB.setBinary(binaryOB);
        attachmentOB.setName(aAttachmentDTO.getName());
        attachmentOB.setType(aAttachmentDTO.getType());
        attachmentOB.setMine_type(aAttachmentDTO.getMine_type());
        attachmentOB.setFile_name(aAttachmentDTO.getFile_name());
        return AttachmentConverter.converterAttachmentOBtoDTO(attachmentRepository.save(attachmentOB));
    }
}
