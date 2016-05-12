package com.uwm.projektz.priority.service.impl;

import com.uwm.projektz.priority.converter.PriorityConverter;
import com.uwm.projektz.priority.dto.PriorityDTO;
import com.uwm.projektz.priority.ob.PriorityOB;
import com.uwm.projektz.priority.repository.IPriorityRepository;
import com.uwm.projektz.priority.service.IPriorityService;
import com.uwm.projektz.user.converter.UserConverter;
import org.springframework.beans.factory.annotation.Autowired;
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
    public PriorityDTO savePriority(PriorityDTO aProrityDTO) {
        return PriorityConverter.converterPriorityOBtoDTO(priorityRepository.save(PriorityConverter.converterPriorityDTOtoOB(aProrityDTO)));
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
