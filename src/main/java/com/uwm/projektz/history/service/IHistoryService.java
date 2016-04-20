package com.uwm.projektz.history.service;

import com.uwm.projektz.history.dto.HistoryDTO;
import com.uwm.projektz.user.dto.UserDTO;

import java.util.Date;
import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */
public interface IHistoryService  {

    //CREATE & UPDATE
    HistoryDTO saveHistory(HistoryDTO aPermissionDTO);

    //READ
    List<HistoryDTO> findHistoryByDate(Date aDate);
    List<HistoryDTO> findHistoryByUser(UserDTO aUserDTO);
    HistoryDTO findHistoryById(Long aId);
    List<HistoryDTO> findAllHistory();
    HistoryDTO findByName(String aName);

    //DELETE
    void deleteHistoryById(Long aId);
}
