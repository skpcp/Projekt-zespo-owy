package com.uwm.projektz.priority.service.impl;

import com.uwm.projektz.priority.dto.PriorityDTO;
import com.uwm.projektz.priority.service.IPriorityService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */
@Service
@Transactional
public class PriorityServiceImpl implements IPriorityService {

    @Override
    public PriorityDTO savePriority(PriorityDTO aProrityDTO) {
        return null;
    }

    @Override
    public PriorityDTO findPriorityById(Long aId) {
        return null;
    }

    @Override
    public List<PriorityDTO> findAllPriorities() {
        return null;
    }

    @Override
    public PriorityDTO findByName(String aName) {
        return null;
    }

    @Override
    public void deletePriority(Long aId) {

    }
}
