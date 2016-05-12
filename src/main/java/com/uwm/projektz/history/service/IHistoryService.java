package com.uwm.projektz.history.service;

import com.uwm.projektz.MyServerException;
import com.uwm.projektz.history.dto.HistoryDTO;
import com.uwm.projektz.history.dto.HistoryDTOWithoutAttachment;
import com.uwm.projektz.user.dto.UserDTO;

import java.util.Date;
import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */
public interface IHistoryService  {

    //CREATE & UPDATE
    HistoryDTO saveHistory(HistoryDTOWithoutAttachment aPermissionDTO) throws MyServerException;

    //UPDATE
    //dodawanie attachmentu

    //READ
    List<HistoryDTO> findHistoryByDateAndUser(Date aDate,Long aId);
    List<HistoryDTO> findHistoryByDate(Date aDate);
    List<HistoryDTO> findHistoryByUser(Long aLogin);
    HistoryDTO findHistoryById(Long aId);
    List<HistoryDTO> findAllHistory();

    //DELETE
    //usuwanie attachmentow ,
    void deleteHistoryById(Long aId);
}
