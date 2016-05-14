package com.uwm.projektz.priority.service.impl;

import com.uwm.projektz.MyServerException;
import com.uwm.projektz.priority.converter.PriorityConverter;
import com.uwm.projektz.priority.dto.PriorityDTO;
import com.uwm.projektz.priority.dto.PriorityDTOCreate;
import com.uwm.projektz.priority.dto.PriorityDTOUpdateName;
import com.uwm.projektz.priority.ob.PriorityOB;
import com.uwm.projektz.priority.repository.IPriorityRepository;
import com.uwm.projektz.priority.service.IPriorityService;
import com.uwm.projektz.user.converter.UserConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */
@Service
@Transactional
public class PriorityServiceImpl implements IPriorityService {

    @Autowired
    IPriorityRepository priorityRepository;

    @Override
    public PriorityDTO savePriority(PriorityDTOCreate aProrityDTO) {
        PriorityOB priorityOB = aProrityDTO.getName() == null ? null : priorityRepository.findPriorityByName(aProrityDTO.getName());
        if(priorityOB == null){
            priorityOB = PriorityConverter.converterPriorityDTOCreateToPriorityOB(aProrityDTO);
            return PriorityConverter.converterPriorityOBtoDTO(priorityRepository.save(priorityOB));
        }
        priorityOB.setResponseTime(aProrityDTO.getResponseTime());
        return PriorityConverter.converterPriorityOBtoDTO(priorityRepository.save(priorityOB));
    }

    @Override
    public PriorityDTO changePriortyName(PriorityDTOUpdateName aPriorityDTO) throws MyServerException{
        PriorityOB priorityOB = aPriorityDTO.getId() == null ? null : priorityRepository.findOne(aPriorityDTO.getId());
        if(priorityOB == null) throw new MyServerException("Priority not found", HttpStatus.NOT_FOUND);
        PriorityOB priorityOBName = aPriorityDTO.getaName() == null ? null : priorityRepository.findPriorityByName(aPriorityDTO.getaName());
        if(priorityOBName != null) throw new MyServerException("Priorirty with this name exists",HttpStatus.METHOD_NOT_ALLOWED);
        //wszystko ok
        priorityOB.setName(aPriorityDTO.getaName());
        return PriorityConverter.converterPriorityOBtoDTO(priorityRepository.save(priorityOB));
    }

    @Override
    public PriorityDTO findPriorityById(Long aId) {
        PriorityOB temp = priorityRepository.findOne(aId);
        return PriorityConverter.converterPriorityOBtoDTO(temp);
    }

    @Override
    public List<PriorityDTO> findAllPriorities() {
        List<PriorityOB> temp = priorityRepository.findAll();
        return PriorityConverter.converterPriorityListOBtoDTO(temp);
    }

    @Override
    public PriorityDTO findByName(String aName) {
        PriorityOB temp = priorityRepository.findPriorityByName(aName);
        return PriorityConverter.converterPriorityOBtoDTO(temp);
    }

    @Override
    public void deletePriority(Long aId) {
        priorityRepository.delete(aId);
    }
}
