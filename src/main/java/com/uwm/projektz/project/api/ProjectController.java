package com.uwm.projektz.project.api;

import com.uwm.projektz.MyServerException;
import com.uwm.projektz.project.dto.ProjectDTO;
import com.uwm.projektz.project.dto.ProjectDTOCreate;
import com.uwm.projektz.project.dto.ProjectDTOName;
import com.uwm.projektz.project.service.IProjectService;
import com.uwm.projektz.user.dto.UserDTOLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */

@RestController
@RequestMapping("/projektz/projects")
public class ProjectController {

    @Autowired
    IProjectService projectService;

    @RequestMapping(value = "/getById/{id}",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<ProjectDTO> findProjectByid(@PathVariable("id") Long aId){
        return new ResponseEntity<>(projectService.findProjectById(aId), HttpStatus.OK);
    }

    @RequestMapping(value="/getAll", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<ProjectDTO>> findAllProjects(){
        return new ResponseEntity<>(projectService.findAllProjects(),HttpStatus.OK);
    }

    @RequestMapping(value = "/getByName/{name}",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<ProjectDTO> findProjectByName(@PathVariable("name") String aName){
        return new ResponseEntity<>(projectService.findProjectByName(aName),HttpStatus.OK);
    }

    @RequestMapping(value = "/getByPriority/{priority.name}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<ProjectDTO>> findProjectsByPriority(@PathVariable("priority.name") String aName){
        return new ResponseEntity<>(projectService.findProjectsByPriority(aName),HttpStatus.OK);
    }


    //CREATE & EDIT
    @RequestMapping(value="/saveProject",method = RequestMethod.POST, consumes ="application/json", produces = "application/json")
    @ResponseBody
    public ResponseEntity<ProjectDTO> saveProject(@RequestBody ProjectDTOCreate aProjectDTO){
        try {
            return new ResponseEntity<>(projectService.saveProject(aProjectDTO), HttpStatus.OK);
        }catch (MyServerException e){
            return new ResponseEntity<>(e.getHeaders(),e.getStatus());
        }
    }


    @RequestMapping(value="/removeProject/{id}", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Void> deleteProjectById(@PathVariable("id") Long aId){
        projectService.deleteProjectById(aId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/changeNameForProject",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<ProjectDTO> updateProjectName(@RequestBody ProjectDTOName aProjectDTO){
        try{
            return new ResponseEntity<>(projectService.changeNameOfProject(aProjectDTO),HttpStatus.OK);
        }catch (MyServerException e){
            return new ResponseEntity<>(e.getHeaders(),e.getStatus());
        }
    }



}
