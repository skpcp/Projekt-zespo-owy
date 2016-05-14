package com.uwm.projektz.user.converter;

import com.uwm.projektz.permission.converter.PermissionConverter;
import com.uwm.projektz.project.converter.ProjectConverter;
import com.uwm.projektz.role.converter.RoleConverter;
import com.uwm.projektz.user.dto.UserDTOCreate;
import com.uwm.projektz.user.dto.UserDTO;
import com.uwm.projektz.user.ob.UserOB;

import java.util.ArrayList;
import java.util.List;


public class UserConverter {

    public static UserDTO converterUserOBtoUserDTO(UserOB aUserOB){
        return new UserDTO(
                aUserOB.getId(),
                aUserOB.getTechDate(),
                aUserOB.getName(),
                aUserOB.getSurname(),
                aUserOB.getEmail(),
                aUserOB.getLogin(),
                aUserOB.getActive(),
                RoleConverter.converterRoleOBtoDTO(aUserOB.getRole()),
                ProjectConverter.converterProjectListOBtoDTO(aUserOB.getProjects()),
                PermissionConverter.converterPermissionListOBtoDTO(aUserOB.getPermissions())
        );
    }

    public static List<UserDTO> converterListUserOBtoListUserDTO(List<UserOB> aUserListOB){
        if (aUserListOB == null) return null;

        List<UserDTO> temp = new ArrayList<>();

        for (UserOB element : aUserListOB){
            temp.add(converterUserOBtoUserDTO(element));
        }
        return temp;
    }

    public static UserOB converterUserDTOCreateToUserOB(UserDTOCreate aUserDTOCreate){
        if(aUserDTOCreate == null) return null;
        return new UserOB(aUserDTOCreate.getName(),aUserDTOCreate.getSurname(),aUserDTOCreate.getEmail(),aUserDTOCreate.getLogin(),aUserDTOCreate.getMd5pass());
    }




}