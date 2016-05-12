package com.uwm.projektz.user.converter;

import com.uwm.projektz.permission.converter.PermissionConverter;
import com.uwm.projektz.project.converter.ProjectConverter;
import com.uwm.projektz.role.converter.RoleConverter;
import com.uwm.projektz.user.dto.UserDTO;
import com.uwm.projektz.user.dto.UserDTOWithoutMd5Pass;
import com.uwm.projektz.user.ob.UserOB;

import java.util.ArrayList;
import java.util.List;


public class UserConverter {

//User
    public static UserDTO converterUserOBtoDTO(UserOB aUserOB)
    {
        if (aUserOB == null) return null;

        return new UserDTO(aUserOB.getId(),aUserOB.getTechDate(),aUserOB.getName(),aUserOB.getSurname(),aUserOB.getEmail(),aUserOB.getLogin(),aUserOB.getMd5pass(),aUserOB.getActive(),
                RoleConverter.converterRoleOBtoDTO(aUserOB.getRole()),
                ProjectConverter.converterProjectListOBtoDTO(aUserOB.getProjects()),
                PermissionConverter.converterPermissionListOBtoDTO(aUserOB.getPermissions()));
    }

    public static UserOB converterUserDTOtoOB(UserDTO aUserDTO){
        if (aUserDTO == null) return null;

        return new UserOB(aUserDTO.getId(),aUserDTO.getTechDate(),aUserDTO.getName(),aUserDTO.getSurname(),aUserDTO.getEmail(),aUserDTO.getLogin(),aUserDTO.getMd5pass(),aUserDTO.getActive(),RoleConverter.converterRoleDTOtoOB(aUserDTO.getRole()), ProjectConverter.converterProjectListDTOtoOB(aUserDTO.getProjects()),PermissionConverter.converterPermissionListDTOtoOB(aUserDTO.getPermissions()));

    }

//Lists
    public static List<UserDTO> converterUserListOBtoDTO (List<UserOB> aUserListOB){
        if (aUserListOB == null) return null;

        List<UserDTO> temp = new ArrayList<UserDTO>();

        for (UserOB element : aUserListOB){
            temp.add(converterUserOBtoDTO(element));
        }
        return temp;
    }
    public static List<UserOB> converterUserListDTOtoOB (List<UserDTO> aUserListDTO){
        if (aUserListDTO == null) return null;

        List<UserOB> temp = new ArrayList<UserOB>();

        for (UserDTO element : aUserListDTO){
            temp.add(converterUserDTOtoOB(element));
        }
        return temp;
    }



    public static UserDTOWithoutMd5Pass converterUserOBtoUserDTOMd5pass(UserOB aUserOB){
        return new UserDTOWithoutMd5Pass(
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

    public static UserOB converterUserDTOWithoutMd5PassToUserOB(UserDTOWithoutMd5Pass aUserDTOWithoutMd5Pass){
        if(aUserDTOWithoutMd5Pass == null) return null;
        return new UserOB(aUserDTOWithoutMd5Pass.getId(),aUserDTOWithoutMd5Pass.getTechDate(),aUserDTOWithoutMd5Pass.getName(),aUserDTOWithoutMd5Pass.getSurname(),aUserDTOWithoutMd5Pass.getEmail(),aUserDTOWithoutMd5Pass.getLogin(),aUserDTOWithoutMd5Pass.getActive(),RoleConverter.converterRoleDTOtoOB(aUserDTOWithoutMd5Pass.getRole()),ProjectConverter.converterProjectListDTOtoOB(aUserDTOWithoutMd5Pass.getProjects()),PermissionConverter.converterPermissionListDTOtoOB(aUserDTOWithoutMd5Pass.getPermissions()));
    }

    public static List<UserDTOWithoutMd5Pass> converterListUserOBtoListUserDTOWithoutMd5pass (List<UserOB> aUserListOB){
        if (aUserListOB == null) return null;

        List<UserDTOWithoutMd5Pass> temp = new ArrayList<>();

        for (UserOB element : aUserListOB){
            temp.add(converterUserOBtoUserDTOMd5pass(element));
        }
        return temp;
    }

    public static List<UserOB> convertListUserDTOWithoutMd5Pass(List<UserDTOWithoutMd5Pass> aUserDTOListWithoutMd5pass){
        if(aUserDTOListWithoutMd5pass == null)
            return null;
        List<UserOB> temp = new ArrayList<>();
        for(UserDTOWithoutMd5Pass element : aUserDTOListWithoutMd5pass){
            temp.add(converterUserDTOWithoutMd5PassToUserOB(element));
        }

        return temp;
    }


}