package com.uwm.projektz.user.service.impl;

import com.uwm.projektz.MyServerException;
import com.uwm.projektz.permission.ob.PermissionOB;
import com.uwm.projektz.permission.repository.IPermissionRepository;
import com.uwm.projektz.project.ob.ProjectOB;
import com.uwm.projektz.project.repository.IProjectRepository;
import com.uwm.projektz.role.ob.RoleOB;
import com.uwm.projektz.role.repository.IRoleRepository;
import com.uwm.projektz.user.converter.UserConverter;
import com.uwm.projektz.user.dto.*;
import com.uwm.projektz.user.ob.UserOB;
import com.uwm.projektz.user.repository.IUserRepository;
import com.uwm.projektz.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */

@Service
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    IUserRepository userRepository;

    @Autowired
    IRoleRepository roleRepository;

    @Autowired
    IPermissionRepository permissionRepository;

    @Autowired
    IProjectRepository projectRepository;

    @Override
    public UserDTO updateUserActivity(UserDTOActive aUserDTO) throws MyServerException {
        UserOB user = aUserDTO.getId() == null ? null : userRepository.findOne(aUserDTO.getId());
        if(user == null) throw new MyServerException("User not found",HttpStatus.NOT_FOUND);
        user.setActive(aUserDTO.getActive() == null ? null : aUserDTO.getActive());
        return UserConverter.converterUserOBtoUserDTO(userRepository.save(user));
    }

    @Override
    public UserDTO findUserById(Long aId) {
        return UserConverter.converterUserOBtoUserDTO(userRepository.findOne(aId));
    }

    @Override
    public List<UserDTO> findAllUsers() {
        return UserConverter.converterListUserOBtoListUserDTO(userRepository.findAll());
    }

    @Override
    public List<UserDTO> findUsersByActivity(Boolean aActive) {
        List<UserOB> users = userRepository.findUserByActivity(aActive);
        return UserConverter.converterListUserOBtoListUserDTO(users);
    }

    @Override
    public UserDTO findUserByLogin(String aLogin) {
        UserOB user = userRepository.findUserByLogin(aLogin);
        return UserConverter.converterUserOBtoUserDTO(user);
    }

    @Override
    public UserDTO findUserByEmail(String aEmail) {
        UserOB user = userRepository.findUserByEmail(aEmail);
        return UserConverter.converterUserOBtoUserDTO(user);
    }

    @Override
    public List<UserDTO> findUsersByName(String aName) {
        List<UserOB> user = userRepository.findUserByName(aName);
        return UserConverter.converterListUserOBtoListUserDTO(user);
    }

    @Override
    public List<UserDTO> findUsersBySurname(String aSurname) {
        List<UserOB> user = userRepository.findUserBySurname(aSurname);
        return UserConverter.converterListUserOBtoListUserDTO(user);
    }

    @Override
    public List<UserDTO> findUsersByNameAndSurname(String aName, String aSurname) {
        List<UserOB> users = userRepository.findUserByNameAndSurname(aName,aSurname);
        return UserConverter.converterListUserOBtoListUserDTO(users);
    }

    @Override
    public List<UserDTO> findUsersByRole(String aRole) {
        List<UserOB> users = userRepository.findUserByRole(aRole);
        return UserConverter.converterListUserOBtoListUserDTO(users);
    }

    @Override
    public UserDTO saveUser(UserDTOCreate aUserDTO) {
        UserOB userOB = aUserDTO.getLogin() == null ? null : userRepository.findUserByLogin(aUserDTO.getLogin());
        if(userOB == null){
            //zapisz nowego usera
            userOB = UserConverter.converterUserDTOCreateToUserOB(aUserDTO);
            userOB.setRole(roleRepository.findRoleByName("USER"));
            userOB.setActive(true);
            return UserConverter.converterUserOBtoUserDTO(userRepository.save(userOB));
        }
        //w przeciwnym wypadku zmien edycja
        userOB.setTechDate(new Date());
        userOB.setName(aUserDTO.getName());
        userOB.setSurname(aUserDTO.getSurname());
        return UserConverter.converterUserOBtoUserDTO(userRepository.save(userOB));


    }


    @Override
    public UserDTO updateUserLogin(UserDTOLogin aUserDTO) throws MyServerException {
        UserOB user = aUserDTO.getId() == null ? null : userRepository.findOne(aUserDTO.getId());
        if(user == null) throw new MyServerException("User not found",HttpStatus.NOT_FOUND);
        UserOB userLogin = aUserDTO.getLogin() == null ? null : userRepository.findUserByLogin(aUserDTO.getLogin());
        if(userLogin != null) throw  new MyServerException("User with that login exists", HttpStatus.METHOD_NOT_ALLOWED); //nie moze byc uzytkownika o takim samym loginie
        user.setLogin(aUserDTO.getLogin());
        return UserConverter.converterUserOBtoUserDTO(userRepository.save(user));
    }

    @Override
    public UserDTO updateUserEmail(UserDTOEmail aUserDTOEmail) throws MyServerException{
        UserOB user = aUserDTOEmail.getId() == null ? null : userRepository.findOne(aUserDTOEmail.getId());
        if(user == null) throw new MyServerException("User not found",HttpStatus.NOT_FOUND);
        UserOB userEmail = aUserDTOEmail.getEmail() == null ? null : userRepository.findUserByEmail(aUserDTOEmail.getEmail());
        if(userEmail != null) throw new MyServerException("User with that email exists",HttpStatus.METHOD_NOT_ALLOWED);//nie może być drugi taki sam;
        user.setEmail(aUserDTOEmail.getEmail());
        return UserConverter.converterUserOBtoUserDTO(userRepository.save(user));
    }

    @Override
    public UserDTO updatePermissionsListForUser(UserDTOPermissions aUserDTO) throws MyServerException {
        UserOB user = aUserDTO.getId() == null ? null : userRepository.findOne(aUserDTO.getId());
        if(user == null) throw new MyServerException("User not found",HttpStatus.NOT_FOUND);
        List<PermissionOB> permissions = new ArrayList<>();
        if((aUserDTO.getPermissions() == null)) throw new MyServerException("User permissions not found",HttpStatus.NOT_FOUND);
        for(String permissionForUser : aUserDTO.getPermissions())
        {
            PermissionOB permissionOB = permissionRepository.findPermissionByName(permissionForUser);
            if(permissionOB == null) throw  new MyServerException("Permission not found",HttpStatus.NOT_FOUND);
            permissions.add(permissionOB);
        }
        user.setPermissions(permissions);
        return UserConverter.converterUserOBtoUserDTO(userRepository.save(user));
    }

    @Override
    public UserDTO updateProjectListForUser(UserDTOProjects aUserDTO) throws MyServerException {
        UserOB user = userRepository.findOne(aUserDTO.getId());
        if(user == null) throw new MyServerException("User not found",HttpStatus.NOT_FOUND);
        List<ProjectOB> projects = new ArrayList<>();
        if(aUserDTO.getProjects()== null) throw new MyServerException("Projects not found",HttpStatus.NOT_FOUND);
        for(String  project : aUserDTO.getProjects()){
            ProjectOB projectOB  = projectRepository.findProjectByName(project);
            if(projectOB == null) throw new MyServerException("Project not found",HttpStatus.NOT_FOUND);
            projects.add(projectOB);
        }
        user.setProjects(projects);
        return UserConverter.converterUserOBtoUserDTO(userRepository.save(user));
    }

    @Override
    public UserDTO updateUserRole(UserDTORole aUserDTO) throws MyServerException {
        UserOB user = aUserDTO.getId() == null ? null : userRepository.findOne(aUserDTO.getId());
        if(user == null) throw new MyServerException("User not found",HttpStatus.NOT_FOUND);
        RoleOB roleOB = aUserDTO.getRole() == null ? null : roleRepository.findRoleByName(aUserDTO.getRole());
        if(roleOB == null) throw new MyServerException("Role not found",HttpStatus.NOT_FOUND);
        user.setRole(roleOB);
        return UserConverter.converterUserOBtoUserDTO(userRepository.save(user));
    }

    @Override
    public void deletUser(Long aId) {
        userRepository.delete(aId);
    }
}
