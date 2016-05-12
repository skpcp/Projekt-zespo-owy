package com.uwm.projektz.user.api;

import com.uwm.projektz.MyServerException;
import com.uwm.projektz.permission.dto.PermissionDTO;
import com.uwm.projektz.project.dto.ProjectDTO;
import com.uwm.projektz.user.dto.*;
import com.uwm.projektz.user.service.IUserService;
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
@Transactional
@RequestMapping(value = "/projektz/users")
public class UserController {

    @Autowired
    IUserService userService;

    //READ
    @RequestMapping(value = "/getById/{id}",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<UserDTOWithoutMd5Pass> findUserByid(@PathVariable("id") Long aId){
        return new ResponseEntity<>(userService.findUserById(aId), HttpStatus.OK);
    }

    @RequestMapping(value="/getAll", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<UserDTOWithoutMd5Pass>> findAllUsers(){
        return new ResponseEntity<>(userService.findAllUsers(),HttpStatus.OK);
    }

    @RequestMapping(value="/getByActivity/{active}",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<UserDTOWithoutMd5Pass>> findUsersByActivity(@PathVariable("active")Boolean aActive){
        return new ResponseEntity<>(userService.findUsersByActivity(aActive),HttpStatus.OK);
    }

    @RequestMapping(value="/getByLogin/{login}",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<UserDTOWithoutMd5Pass> findUserByLogin(@PathVariable("login")String aLogin){
        return new ResponseEntity<>(userService.findUserByLogin(aLogin),HttpStatus.OK);
    }

    @RequestMapping(value="/getByEmail/{email}",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<UserDTOWithoutMd5Pass> findUserByEmail(@PathVariable("email") String aEmail){
        return new ResponseEntity<>(userService.findUserByEmail(aEmail),HttpStatus.OK);
    }

    @RequestMapping(value="/getByName/{name}",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<UserDTOWithoutMd5Pass>> findUsersByName(@PathVariable("name") String aName){
        return new ResponseEntity<>(userService.findUsersByName(aName),HttpStatus.OK);
    }


    @RequestMapping(value="/getBySurame/{surname}",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<UserDTOWithoutMd5Pass>> findUsersBySurname(@PathVariable("surname") String aSurname){
        return new ResponseEntity<>(userService.findUsersBySurname(aSurname),HttpStatus.OK);
    }


    @RequestMapping(value="/getByNameAndSurname/{name},{surname}",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<UserDTOWithoutMd5Pass>> findUsersByNameAndSurname(@PathVariable("name") String aName,@PathVariable("surname") String aSurname){
        return new ResponseEntity<>(userService.findUsersByNameAndSurname(aName,aSurname),HttpStatus.OK);
    }

    @RequestMapping(value="/getByRole/{role.name}",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<UserDTOWithoutMd5Pass>> findUsersByRole(@PathVariable("role.name") String aRole){
        return new ResponseEntity<>(userService.findUsersByRole(aRole),HttpStatus.OK);
    }

    //CREATE & EDIT
    @RequestMapping(value="/saveUser",method = RequestMethod.POST, consumes ="application/json", produces = "application/json")
    @ResponseBody
    public ResponseEntity<UserDTOWithoutMd5Pass> saveUser(@RequestBody UserDTOCreate aUserDTO){
        return new ResponseEntity<>(userService.saveUser(aUserDTO),HttpStatus.OK);
    }


    @RequestMapping(value="/changeActivity/{id},{active}",method = RequestMethod.POST,consumes = "aplication/json",produces = "appliaction/json")
    @ResponseBody
    public ResponseEntity<Void> updateUserActivity(@PathVariable("id") Long aId ,@PathVariable("active") Boolean aActive){
        try {
            userService.updateUserActivity(aId, aActive);
            return new ResponseEntity<Void>(HttpStatus.OK);
        }catch (MyServerException e) {
            return new ResponseEntity<Void>(e.getHeaders(), e.getStatus());
        }
    }


    @RequestMapping(value="/changeLogin/{id},{login}", method = RequestMethod.POST,consumes = "aplication/json",produces = "appliaction/json")
    @ResponseBody
    public ResponseEntity<Void> updateUserLogin(@PathVariable("id")Long aId, @PathVariable("login") String aLogin){

        try {
            userService.updateUserLogin(aId,aLogin);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (MyServerException e) {
            return new ResponseEntity<>(e.getHeaders(), e.getStatus());
        }
    }

    @RequestMapping(value="/changeEmail/{id},{email}", method = RequestMethod.POST,consumes = "aplication/json",produces = "appliaction/json")
    @ResponseBody
    public ResponseEntity<Void> updateUserEmail(@PathVariable("id")Long aId, @PathVariable("email") String aEmail){
        try
        {
            userService.updateUserEmail(aId,aEmail);
            return new ResponseEntity<Void>(HttpStatus.OK);
        }catch (MyServerException e) {
            return new ResponseEntity<Void>(e.getHeaders(), e.getStatus());
        }
    }

    @RequestMapping(value="/updatePermissionsForUser", method = RequestMethod.POST,consumes = "aplication/json",produces = "appliaction/json")
    @ResponseBody
    public ResponseEntity<UserDTO> updatePermissionListForUser(@RequestBody UserDTOPermissions aUserDTO) {
        try
        {
            return new ResponseEntity<>(userService.updatePermissionsListForUser(aUserDTO),HttpStatus.OK);
        }catch (MyServerException e) {
            return new ResponseEntity<>(e.getHeaders(), e.getStatus());
        }

    }

    @RequestMapping(value="/updateProjectsForUser", method = RequestMethod.POST,consumes = "aplication/json",produces = "appliaction/json")
    @ResponseBody
    public ResponseEntity<Void> updateProjectListForUser(@RequestBody UserDTOProjects aUserDTO){
        try
        {
            userService.updateProjectListForUser(aUserDTO);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (MyServerException e) {
            return new ResponseEntity<Void>(e.getHeaders(), e.getStatus());
        }


    }


    //DELETE
   @RequestMapping(value="/removeUserById/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public ResponseEntity<Void> deleteUser(@PathVariable("id") Long aId){
       try {
           userService.deletUser(aId);
           return new ResponseEntity<>(HttpStatus.OK);
       }catch (MyServerException e){
           return new ResponseEntity<Void>(e.getHeaders(),e.getStatus());
       }

    }

    @RequestMapping(value="/changeUserRole/{id},{role.name}",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Void> changeUserRole(@PathVariable("id") Long aId,@PathVariable("role.name") String aName){
        try {
            userService.updateUserRole(aId, aName);
            return new ResponseEntity<Void>(HttpStatus.OK);
        }catch (MyServerException e){
            return new ResponseEntity<Void>(e.getHeaders(),e.getStatus());
        }

    }


}
