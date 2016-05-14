package com.uwm.projektz.priority.service;

import com.uwm.projektz.MyServerException;
import com.uwm.projektz.priority.dto.PriorityDTO;
import com.uwm.projektz.priority.dto.PriorityDTOCreate;
import com.uwm.projektz.priority.dto.PriorityDTOUpdateName;

import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */
public interface IPriorityService  {

    //CREATE & UPDATE
    PriorityDTO savePriority(PriorityDTOCreate aProrityDTO);
    PriorityDTO changePriortyName(PriorityDTOUpdateName aPriorityDTO) throws MyServerException;

    //READ
    PriorityDTO findPriorityById(Long aId);
    List<PriorityDTO> findAllPriorities();
    PriorityDTO findByName(String aName);

    //DELETE
    void deletePriority(Long aId);
}
