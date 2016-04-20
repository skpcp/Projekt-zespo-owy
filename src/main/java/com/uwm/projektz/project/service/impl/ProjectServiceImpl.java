package com.uwm.projektz.project.service.impl;

import com.uwm.projektz.priority.dto.PriorityDTO;
import com.uwm.projektz.project.dto.ProjectDTO;
import com.uwm.projektz.project.service.IProjectService;
import com.uwm.projektz.user.dto.UserDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */
@Service
@Transactional
public class ProjectServiceImpl implements IProjectService {

    @Override
    public ProjectDTO deleteProjectById(Long aId) {
        return null;
    }

    @Override
    public ProjectDTO saveProject(ProjectDTO aProjectDTO) {
        return null;
    }

    @Override
    public ProjectDTO findProjectById(Long aId) {
        return null;
    }

    @Override
    public List<ProjectDTO> findAllProjects() {
        return null;
    }

    @Override
    public ProjectDTO findProjectByName(String aName) {
        return null;
    }

    @Override
    public List<ProjectDTO> findProjectsByPriority(PriorityDTO aPriorityOB) {
        return null;
    }

    @Override
    public List<ProjectDTO> findUserPorjects(UserDTO aUserDTO) {
        return null;
    }

    @Override
    public ProjectDTO updatePriorityForProject(Long aId, PriorityDTO aPrority) {
        return null;
    }
}
