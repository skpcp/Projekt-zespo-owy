package com.uwm.projektz.project.service.impl;

import com.uwm.projektz.MyServerException;
import com.uwm.projektz.priority.ob.PriorityOB;
import com.uwm.projektz.priority.repository.IPriorityRepository;
import com.uwm.projektz.project.converter.ProjectConverter;
import com.uwm.projektz.project.dto.ProjectDTO;
import com.uwm.projektz.project.dto.ProjectDTOCreate;
import com.uwm.projektz.project.dto.ProjectDTOName;
import com.uwm.projektz.project.ob.ProjectOB;
import com.uwm.projektz.project.repository.IProjectRepository;
import com.uwm.projektz.project.service.IProjectService;
import com.uwm.projektz.user.dto.UserDTOLogin;
import com.uwm.projektz.user.ob.UserOB;
import com.uwm.projektz.user.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
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

    @Autowired
    IUserRepository userRepository;

    @Override
    public void deleteProjectById(Long aId) {
        projectRepository.delete(aId);
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
        //edycja
        priorityOB.setTechDate(new Date());
        projectOB.setDescritpion(aProjectDTO.getDescritpion());
        projectOB.setVersion(aProjectDTO.getVersion());
        return ProjectConverter.converterProjectOBtoDTO(projectRepository.save(projectOB));
    }

    @Override
    public ProjectDTO changeNameOfProject(ProjectDTOName aProjectDTOName) throws MyServerException {
        ProjectOB projectOB = aProjectDTOName.getId() == null ? null : projectRepository.findOne(aProjectDTOName.getId());
        if(projectOB == null) throw new MyServerException("Project not found",HttpStatus.NOT_FOUND);
        ProjectOB projectOBName = aProjectDTOName.getName() == null ? null : projectRepository.findProjectByName(aProjectDTOName.getName());
        if(projectOBName != null) throw new MyServerException("Project with that name exists",HttpStatus.METHOD_NOT_ALLOWED);
        //wszystko ok
        projectOB.setName(aProjectDTOName.getName());
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


}
