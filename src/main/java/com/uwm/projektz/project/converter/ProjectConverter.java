package com.uwm.projektz.project.converter;

import com.uwm.projektz.attachment.dto.AttachmentDTO;
import com.uwm.projektz.attachment.ob.AttachmentOB;
import com.uwm.projektz.binary.dto.BinaryDTO;
import com.uwm.projektz.binary.ob.BinaryOB;
import com.uwm.projektz.history.dto.HistoryDTO;
import com.uwm.projektz.history.ob.HistoryOB;
import com.uwm.projektz.permission.dto.PermissionDTO;
import com.uwm.projektz.permission.ob.PermissionOB;
import com.uwm.projektz.priority.converter.PriorityConverter;
import com.uwm.projektz.priority.dto.PriorityDTO;
import com.uwm.projektz.priority.ob.PriorityOB;
import com.uwm.projektz.project.dto.ProjectDTO;
import com.uwm.projektz.project.ob.ProjectOB;
import com.uwm.projektz.role.dto.RoleDTO;
import com.uwm.projektz.role.ob.RoleOB;
import com.uwm.projektz.ticket.dto.TicketDTO;
import com.uwm.projektz.ticket.ob.TicketOB;
import com.uwm.projektz.user.dto.UserDTO;
import com.uwm.projektz.user.ob.UserOB;

import java.util.ArrayList;
import java.util.List;


public class ProjectConverter {

//Projects
    public static ProjectDTO converterProjectOBtoDTO (ProjectOB aProjectOB){
        if (aProjectOB == null) return null;
        return new ProjectDTO(aProjectOB.getId(),aProjectOB.getTechDate(),aProjectOB.getName(),aProjectOB.getDescritpion(),aProjectOB.getVersion(), PriorityConverter.converterPriorityOBtoDTO(aProjectOB.getPriority()));
    }

    public static ProjectOB converterProjectDTOtoOB(ProjectDTO aProjectDTO){
        if (aProjectDTO == null) return null;
        return new ProjectOB(aProjectDTO.getId(),aProjectDTO.getTechDate(),aProjectDTO.getName(),aProjectDTO.getDescritpion(),aProjectDTO.getVersion(),PriorityConverter.converterPriorityDTOtoOB(aProjectDTO.getPriority()));
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

    public static List<ProjectOB> converterProjectListDTOtoOB (List<ProjectDTO> aProjectList){
        if (aProjectList == null) return null;
        List<ProjectOB> temp = new ArrayList<ProjectOB>();

        for(ProjectDTO element : aProjectList)
        {
            temp.add(converterProjectDTOtoOB(element));
        }
        return temp;
    }
}