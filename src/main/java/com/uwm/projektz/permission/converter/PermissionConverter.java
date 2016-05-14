package com.uwm.projektz.permission.converter;

import com.uwm.projektz.permission.dto.PermissionDTO;
import com.uwm.projektz.permission.ob.PermissionOB;

import java.util.ArrayList;
import java.util.List;


public class PermissionConverter {


//Permission
    public static PermissionDTO converterPermissionOBtoDTO(PermissionOB aPermissionOB)
    {
        if (aPermissionOB == null) return null;
        return new PermissionDTO(aPermissionOB.getId(),aPermissionOB.getTechDate(),aPermissionOB.getName());
    }
    public static PermissionOB converterPermissionDTOtoOB(PermissionDTO aPermissionDTO)
    {
        if (aPermissionDTO == null) return null;
        return new PermissionOB(aPermissionDTO.getName());
    }
    //Permission Listy
    public static List<PermissionOB> converterPermissionListDTOtoOB(List<PermissionDTO> aPermissionList)
    {
        if (aPermissionList == null) return null;
        List<PermissionOB> temp = new ArrayList<>();

        for(PermissionDTO element : aPermissionList)
        {
            temp.add(converterPermissionDTOtoOB(element));
        }
        return temp;
    }
    public static List<PermissionDTO> converterPermissionListOBtoDTO(List<PermissionOB> aPermissionList)
    {
        if (aPermissionList == null) return null;
        List<PermissionDTO> temp = new ArrayList<>();

        for(PermissionOB element : aPermissionList)
        {
            temp.add(converterPermissionOBtoDTO(element));
        }
        return temp;
    }
}