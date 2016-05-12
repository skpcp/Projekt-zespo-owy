package com.uwm.projektz.project.service;

import com.uwm.projektz.MyServerException;
import com.uwm.projektz.priority.dto.PriorityDTO;
import com.uwm.projektz.project.dto.ProjectDTO;
import com.uwm.projektz.project.dto.ProjectDTOCreate;
import com.uwm.projektz.user.dto.UserDTO;

import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */
public interface IProjectService {

    //CREATE AND EDIT
    ProjectDTO saveProject(ProjectDTOCreate aProjectDTO) throws MyServerException;

    //READ
    ProjectDTO findProjectById(Long aId);
    List<ProjectDTO> findAllProjects();
    ProjectDTO findProjectByName(String aName);
    List<ProjectDTO> findProjectsByPriority(String aName);
    List<ProjectDTO> findUserProjects(Long aId);//albo po id usera w sumie to juz mam pobierajac usera




    //DELETE
   ProjectDTO deleteProjectById(Long aId);
    /**
        czy chcemy usuwać?
     Usunięcie jednego projektu wymaga usunięcia wszystkich miejsc w którym wystepuje , usuniecie w uzytkowniku
     we wszystkich listach
    */
}
