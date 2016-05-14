package com.uwm.projektz.user.api;

import com.uwm.projektz.MyServerException;
import com.uwm.projektz.user.dto.*;
import com.uwm.projektz.user.service.IUserService;

import org.slf4j.LoggerFactory;
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
@RequestMapping(value = "/projektz/users")
public class UserController {

    public static final org.slf4j.Logger loger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    IUserService userService;

    //READ
    @RequestMapping(value = "/getById/{id}",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<UserDTO> findUserByid(@PathVariable("id") Long aId){
        return new ResponseEntity<>(userService.findUserById(aId), HttpStatus.OK);
    }

    @RequestMapping(value="/getAll", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<UserDTO>> findAllUsers(){
        return new ResponseEntity<>(userService.findAllUsers(),HttpStatus.OK);
    }

    @RequestMapping(value="/getByActivity/{active}",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<UserDTO>> findUsersByActivity(@PathVariable("active")Boolean aActive){
        return new ResponseEntity<>(userService.findUsersByActivity(aActive),HttpStatus.OK);
    }

    @RequestMapping(value="/getByLogin/{login}",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<UserDTO> findUserByLogin(@PathVariable("login")String aLogin){
        return new ResponseEntity<>(userService.findUserByLogin(aLogin),HttpStatus.OK);
    }

    @RequestMapping(value="/getByEmail/{email}",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<UserDTO> findUserByEmail(@PathVariable("email") String aEmail){
        return new ResponseEntity<>(userService.findUserByEmail(aEmail),HttpStatus.OK);
    }

    @RequestMapping(value="/getByName/{name}",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<UserDTO>> findUsersByName(@PathVariable("name") String aName){
        return new ResponseEntity<>(userService.findUsersByName(aName),HttpStatus.OK);
    }


    @RequestMapping(value="/getBySurame/{surname}",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<UserDTO>> findUsersBySurname(@PathVariable("surname") String aSurname){
        return new ResponseEntity<>(userService.findUsersBySurname(aSurname),HttpStatus.OK);
    }


    @RequestMapping(value="/getByNameAndSurname/{name},{surname}",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<UserDTO>> findUsersByNameAndSurname(@PathVariable("name") String aName, @PathVariable("surname") String aSurname){
        return new ResponseEntity<>(userService.findUsersByNameAndSurname(aName,aSurname),HttpStatus.OK);
    }

    @RequestMapping(value="/getByRole/{role.name}",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<UserDTO>> findUsersByRole(@PathVariable("role.name") String aRole){
        return new ResponseEntity<>(userService.findUsersByRole(aRole),HttpStatus.OK);
    }

    //CREATE & EDIT
    @RequestMapping(value="/saveUser",method = RequestMethod.POST, consumes ="application/json", produces = "application/json")
    @ResponseBody
    public ResponseEntity<UserDTO> saveUser(@RequestBody UserDTOCreate aUserDTO){
        return new ResponseEntity<>(userService.saveUser(aUserDTO),HttpStatus.OK);
    }


    @RequestMapping(value="/changeActivity",method = RequestMethod.POST, consumes ="application/json", produces = "application/json")
    @ResponseBody
    public ResponseEntity<UserDTO> updateUserActivity(@RequestBody UserDTOActive aUserDTO ){
        try {
            return new ResponseEntity<>(userService.updateUserActivity(aUserDTO),HttpStatus.OK);
        }catch (MyServerException e) {
            return new ResponseEntity<>(e.getHeaders(), e.getStatus());
        }
    }


    @RequestMapping(value="/changeLogin", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<UserDTO> updateUserLogin(@RequestBody UserDTOLogin aUserDTO){
        try {
            return new ResponseEntity<>(userService.updateUserLogin(aUserDTO),HttpStatus.OK);
        }catch (MyServerException e) {
            return new ResponseEntity<>(e.getHeaders(), e.getStatus());
        }
    }

    @RequestMapping(value="/changeEmail", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<UserDTO> updateUserEmail(@RequestBody UserDTOEmail aUserDTO){
        try
        {
            return new ResponseEntity<>(userService.updateUserEmail(aUserDTO),HttpStatus.OK);
        }catch (MyServerException e) {
            return new ResponseEntity<>(e.getHeaders(), e.getStatus());
        }
    }

    @RequestMapping(value="/updatePermissionsForUser", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<UserDTO> updatePermissionListForUser(@RequestBody UserDTOPermissions aUserDTO) {
        loger.debug("Permission add"+aUserDTO.toString());
        try
        {
            return new ResponseEntity<>(userService.updatePermissionsListForUser(aUserDTO),HttpStatus.OK);
        }catch (MyServerException e) {
            return new ResponseEntity<>(e.getHeaders(), e.getStatus());
        }

    }

    @RequestMapping(value="/updateProjectsForUser", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<UserDTO> updateProjectListForUser(@RequestBody UserDTOProjects aUserDTO ){
        try
        {
            return new ResponseEntity<>(userService.updateProjectListForUser(aUserDTO),HttpStatus.OK);
        }catch (MyServerException e) {
            return new ResponseEntity<>(e.getHeaders(), e.getStatus());
        }
    }


    //DELETE
   @RequestMapping(value="/removeUserById/{id}",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Void> deleteUser(@PathVariable("id") Long aId){
       try {
           userService.deletUser(aId);
           return new ResponseEntity<>(HttpStatus.OK);
       }catch (MyServerException e){
           return new ResponseEntity<Void>(e.getHeaders(),e.getStatus());
       }

    }

    @RequestMapping(value="/changeUserRole",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<UserDTO> changeUserRole(@RequestBody UserDTORole aUserDTO){
        try {

            return new ResponseEntity<UserDTO>( userService.updateUserRole(aUserDTO),HttpStatus.OK);
        }catch (MyServerException e){
            return new ResponseEntity<UserDTO>(e.getHeaders(),e.getStatus());
        }

    }


}
