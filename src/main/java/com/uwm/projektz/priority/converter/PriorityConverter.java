package com.uwm.projektz.priority.converter;

import com.uwm.projektz.priority.dto.PriorityDTO;
import com.uwm.projektz.priority.dto.PriorityDTOCreate;
import com.uwm.projektz.priority.ob.PriorityOB;

import java.util.ArrayList;
import java.util.List;


public class PriorityConverter {

//Priority
    public static PriorityDTO converterPriorityOBtoDTO(PriorityOB aPriorityOB){
        if (aPriorityOB == null) return null;
        return new PriorityDTO(aPriorityOB.getId(),aPriorityOB.getTechDate(),aPriorityOB.getName(),aPriorityOB.getResponseTime());
    }

//PriorityLists
    public static List<PriorityDTO> converterPriorityListOBtoDTO(List<PriorityOB> aPriorityListOB){
        if (aPriorityListOB == null) return null;
        List<PriorityDTO> temp = new ArrayList<PriorityDTO>();

        for (PriorityOB element : aPriorityListOB){
            temp.add(converterPriorityOBtoDTO(element));
        }
        return temp;
    }

    public static PriorityOB converterPriorityDTOCreateToPriorityOB(PriorityDTOCreate aPriorityDTOCreate){
        return aPriorityDTOCreate == null ? null : new PriorityOB(aPriorityDTOCreate.getName(),aPriorityDTOCreate.getResponseTime());
    }

}