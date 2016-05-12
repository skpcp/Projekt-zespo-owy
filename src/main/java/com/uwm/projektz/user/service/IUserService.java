package com.uwm.projektz.user.service;

import com.uwm.projektz.MyServerException;
import com.uwm.projektz.permission.dto.PermissionDTO;
import com.uwm.projektz.project.dto.ProjectDTO;
import com.uwm.projektz.user.dto.*;

import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */

public interface IUserService {

    //CREATE & EDIT
    UserDTOWithoutMd5Pass saveUser(UserDTOCreate aUserDTO);

    //READ
    UserDTOWithoutMd5Pass findUserById(Long aId);
    List<UserDTOWithoutMd5Pass> findAllUsers();
    List<UserDTOWithoutMd5Pass> findUsersByActivity(Boolean aActive);
    UserDTOWithoutMd5Pass findUserByLogin(String aLogin);
    UserDTOWithoutMd5Pass findUserByEmail(String aEmail);
    List<UserDTOWithoutMd5Pass> findUsersByName(String aName);
    List<UserDTOWithoutMd5Pass> findUsersBySurname(String aSurname);
    List<UserDTOWithoutMd5Pass> findUsersByNameAndSurname(String aName,String aSurname);
    List<UserDTOWithoutMd5Pass> findUsersByRole(String aRole);

    //UPDATE
    void updateUserActivity(Long aId,Boolean aActive) throws MyServerException;
    void updateUserLogin(Long aId, String aLogin) throws MyServerException;
    void updateUserEmail(Long aId,String aName) throws MyServerException;
    void updateUserRole(Long aId,String aName) throws MyServerException;
    UserDTO updatePermissionsListForUser(UserDTOPermissions aUserDTO) throws MyServerException;
    void updateProjectListForUser(UserDTOProjects aUserDTO) throws MyServerException;

    //DELETE
    void deletUser(Long aId) throws  MyServerException;
}
