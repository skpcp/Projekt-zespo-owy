package com.uwm.projektz.project.service;

import com.uwm.projektz.MyServerException;
import com.uwm.projektz.project.dto.ProjectDTO;
import com.uwm.projektz.project.dto.ProjectDTOCreate;
import com.uwm.projektz.project.dto.ProjectDTOName;
import com.uwm.projektz.user.dto.UserDTOLogin;

import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */
public interface IProjectService {

    //CREATE AND EDIT
    ProjectDTO saveProject(ProjectDTOCreate aProjectDTO) throws MyServerException;

    //UPDATE
    ProjectDTO changeNameOfProject(ProjectDTOName aProjectDTOName) throws MyServerException;

    //READ
    ProjectDTO findProjectById(Long aId);
    List<ProjectDTO> findAllProjects();
    ProjectDTO findProjectByName(String aName);
    List<ProjectDTO> findProjectsByPriority(String aName);

    //DELETE
   void deleteProjectById(Long aId);

}
