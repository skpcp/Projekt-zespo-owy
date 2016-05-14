package com.uwm.projektz.project.converter;

import com.uwm.projektz.priority.converter.PriorityConverter;
import com.uwm.projektz.project.dto.ProjectDTO;
import com.uwm.projektz.project.ob.ProjectOB;

import java.util.ArrayList;
import java.util.List;


public class ProjectConverter {

//Projects
    public static ProjectDTO converterProjectOBtoDTO (ProjectOB aProjectOB){
        if (aProjectOB == null) return null;
        return new ProjectDTO(aProjectOB.getId(),aProjectOB.getTechDate(),aProjectOB.getName(),aProjectOB.getDescritpion(),aProjectOB.getVersion(), PriorityConverter.converterPriorityOBtoDTO(aProjectOB.getPriority()));
    }

    //ProjectsLists
    public static List<ProjectDTO> converterProjectListOBtoDTO (List<ProjectOB> aProjectList){
        if (aProjectList == null) return null;
        List<ProjectDTO> temp = new ArrayList<ProjectDTO>();

        for(ProjectOB element : aProjectList)
        {
            temp.add(converterProjectOBtoDTO(element));
        }
        return temp;
    }


}