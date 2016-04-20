package com.uwm.projektz.history.service.impl;

import com.uwm.projektz.history.dto.HistoryDTO;
import com.uwm.projektz.history.service.IHistoryService;
import com.uwm.projektz.user.dto.UserDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */

@Service
@Transactional
public class HistoryServiceImpl implements IHistoryService{
    @Override
    public HistoryDTO saveHistory(HistoryDTO aPermissionDTO) {
        return null;
    }

    @Override
    public List<HistoryDTO> findHistoryByDate(Date aDate) {
        return null;
    }

    @Override
    public List<HistoryDTO> findHistoryByUser(UserDTO aUserDTO) {
        return null;
    }

    @Override
    public HistoryDTO findHistoryById(Long aId) {
        return null;
    }

    @Override
    public List<HistoryDTO> findAllHistory() {
        return null;
    }

    @Override
    public HistoryDTO findByName(String aName) {
        return null;
    }

    @Override
    public void deleteHistoryById(Long aId) {

    }
}
