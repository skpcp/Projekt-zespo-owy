package com.uwm.projektz.user.service;

import com.uwm.projektz.permission.dto.PermissionDTO;
import com.uwm.projektz.project.dto.ProjectDTO;
import com.uwm.projektz.role.dto.RoleDTO;
import com.uwm.projektz.user.dto.UserDTO;

import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */

public interface IUserService {

    //CREATE & EDIT
    UserDTO saveUser(UserDTO aUserDTO);

    //READ
    UserDTO findUserById(Long aId);
    List<UserDTO> findAllUsers();
    List<UserDTO> findUsersByActivity(Boolean aActive);
    UserDTO findUserByLogin(String aLogin);
    UserDTO findUserByEmail(String aEmail);
    List<UserDTO> findUsersByName(String aName);
    List<UserDTO> findUsersBySurname(String aSurname);
    List<UserDTO> findUsersByNameAndSurname(String aName,String aSurname);
    List<UserDTO> findUsersByRole(RoleDTO aRoleDTO);
    //tylko gdy klucz znajduje się po stronie projektu
    List<UserDTO> findUsersByProject(ProjectDTO aProjectDTO);


    //UPDATE
    UserDTO updateUserActivity(Long aId,Boolean aActive);
    UserDTO updateUser(UserDTO aUserDTO);//PUT
    UserDTO updateUserLogin(Long aId, String aLogin);
    UserDTO updateUserEmail(Long aId,String aName);
    UserDTO updatePermissionsListForUser(Long aId, PermissionDTO aPermissionDTO);
    UserDTO updateProjectListForUser(Long aId, ProjectDTO aProjectDTO);

    //DELETE
    void deletUser(Long aId);
}
