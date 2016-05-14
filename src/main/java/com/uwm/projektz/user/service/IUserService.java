package com.uwm.projektz.user.service;

import com.uwm.projektz.MyServerException;
import com.uwm.projektz.user.dto.*;

import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */

public interface IUserService {

    //CREATE & EDIT
    UserDTO saveUser(UserDTOCreate aUserDTO);

    //READ
    UserDTO findUserById(Long aId);
    List<UserDTO> findAllUsers();
    List<UserDTO> findUsersByActivity(Boolean aActive);
    UserDTO findUserByLogin(String aLogin);
    UserDTO findUserByEmail(String aEmail);
    List<UserDTO> findUsersByName(String aName);
    List<UserDTO> findUsersBySurname(String aSurname);
    List<UserDTO> findUsersByNameAndSurname(String aName, String aSurname);
    List<UserDTO> findUsersByRole(String aRole);

    //UPDATE
    UserDTO updateUserActivity(UserDTOActive aUserDTO) throws MyServerException;
    UserDTO updateUserLogin(UserDTOLogin aUserDTO) throws MyServerException;
    UserDTO updateUserEmail(UserDTOEmail aUserDTO) throws MyServerException;
    UserDTO updateUserRole(UserDTORole aUserDTO) throws MyServerException;
    UserDTO updatePermissionsListForUser(UserDTOPermissions aUserDTO) throws MyServerException;
    UserDTO updateProjectListForUser(UserDTOProjects aUserDTO) throws MyServerException;

    //DELETE
    void deletUser(Long aId) throws  MyServerException;
}
