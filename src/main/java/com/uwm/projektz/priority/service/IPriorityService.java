package com.uwm.projektz.priority.service;

import com.uwm.projektz.priority.dto.PriorityDTO;

import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */
public interface IPriorityService  {

    //CREATE & UPDATE
    PriorityDTO savePriority(PriorityDTO aProrityDTO);

    //READ
    PriorityDTO findPriorityById(Long aId);
    List<PriorityDTO> findAllPriorities();
    PriorityDTO findByName(String aName);

    //DELETE
    void deletePriority(Long aId);
}
