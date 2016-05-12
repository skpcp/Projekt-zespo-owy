package com.uwm.projektz.project.service.impl;

import com.uwm.projektz.MyServerException;
import com.uwm.projektz.priority.converter.PriorityConverter;
import com.uwm.projektz.priority.dto.PriorityDTO;
import com.uwm.projektz.priority.ob.PriorityOB;
import com.uwm.projektz.priority.repository.IPriorityRepository;
import com.uwm.projektz.project.converter.ProjectConverter;
import com.uwm.projektz.project.dto.ProjectDTO;
import com.uwm.projektz.project.dto.ProjectDTOCreate;
import com.uwm.projektz.project.ob.ProjectOB;
import com.uwm.projektz.project.repository.IProjectRepository;
import com.uwm.projektz.project.service.IProjectService;
import com.uwm.projektz.user.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */
@Service
@Transactional
public class ProjectServiceImpl implements IProjectService {

    @Autowired
    IProjectRepository projectRepository;

    @Autowired
    IPriorityRepository priorityRepository;

    @Override
    public ProjectDTO deleteProjectById(Long aId) {
        projectRepository.delete(aId);
        return null;
    }

    @Override
    public ProjectDTO saveProject(ProjectDTOCreate aProjectDTO) throws MyServerException {
        PriorityOB priorityOB = aProjectDTO.getPriority() == null ? null : priorityRepository.findPriorityByName(aProjectDTO.getPriority());
        if(priorityOB == null) throw new MyServerException("Priority not found", HttpStatus.NOT_FOUND);
        ProjectOB projectOB = aProjectDTO.getName() == null ? null : projectRepository.findProjectByName(aProjectDTO.getName());
        if(projectOB == null){
            //zapisz nowy projekt
            projectOB = new ProjectOB(aProjectDTO.getName(),aProjectDTO.getDescritpion(),aProjectDTO.getVersion(),priorityOB);
            return ProjectConverter.converterProjectOBtoDTO(projectRepository.save(projectOB));

        }
        projectOB.setName(aProjectDTO.getName());
        projectOB.setDescritpion(aProjectDTO.getDescritpion());
        projectOB.setVersion(aProjectDTO.getVersion());
        return ProjectConverter.converterProjectOBtoDTO(projectRepository.save(projectOB));
    }

    @Override
    public ProjectDTO findProjectById(Long aId) {
        ProjectOB temp = projectRepository.findOne(aId);
        return ProjectConverter.converterProjectOBtoDTO(temp);
    }

    @Override
    public List<ProjectDTO> findAllProjects() {
        List<ProjectDTO> temp = ProjectConverter.converterProjectListOBtoDTO(projectRepository.findAll());
        return temp;
    }

    @Override
    public ProjectDTO findProjectByName(String aName) {
        ProjectOB project = projectRepository.findProjectByName(aName);
        return ProjectConverter.converterProjectOBtoDTO(project);

    }

    @Override
    public List<ProjectDTO> findProjectsByPriority(String aName) {
        List<ProjectOB> projects = projectRepository.findProjectByPriority(aName);
        return ProjectConverter.converterProjectListOBtoDTO(projects);
    }

    @Override
    public List<ProjectDTO> findUserProjects(Long aId) {
        List<ProjectOB> projects = projectRepository.findUserProjects(aId);
        return ProjectConverter.converterProjectListOBtoDTO(projects);
    }


}
