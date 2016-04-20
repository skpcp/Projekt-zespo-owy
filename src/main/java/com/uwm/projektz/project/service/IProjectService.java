package com.uwm.projektz.project.service;

import com.uwm.projektz.priority.dto.PriorityDTO;
import com.uwm.projektz.project.dto.ProjectDTO;
import com.uwm.projektz.user.dto.UserDTO;

import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */
public interface IProjectService {

    //CREATE AND EDIT
    ProjectDTO saveProject(ProjectDTO aProjectDTO);

    //READ
    ProjectDTO findProjectById(Long aId);
    List<ProjectDTO> findAllProjects();
    ProjectDTO findProjectByName(String aName);
    List<ProjectDTO> findProjectsByPriority(PriorityDTO aPriorityOB);
    List<ProjectDTO> findUserPorjects(UserDTO aUserDTO);//albo po id usera w sumie to juz mam pobierajac usera

    //UPDATE
    ProjectDTO updatePriorityForProject(Long aId,PriorityDTO aPrority);


    //DELETE
   ProjectDTO deleteProjectById(Long aId);
    /**
        czy chcemy usuwać?
     Usunięcie jednego projektu wymaga usunięcia wszystkich miejsc w którym wystepuje , usuniecie w uzytkowniku
     we wszystkich listach
    */
}
