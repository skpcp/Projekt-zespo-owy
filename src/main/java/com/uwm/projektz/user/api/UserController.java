package com.uwm.projektz.user.api;

import com.uwm.projektz.permission.dto.PermissionDTO;
import com.uwm.projektz.project.dto.ProjectDTO;
import com.uwm.projektz.role.dto.RoleDTO;
import com.uwm.projektz.user.dto.UserDTO;
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


    @RequestMapping(value="/getBySurame/{name},{surname}",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<UserDTO>> findUsersByNameAndSurname(@PathVariable("name") String aName,@PathVariable("surname") String aSurname){
        return new ResponseEntity<>(userService.findUsersByNameAndSurname(aName,aSurname),HttpStatus.OK);
    }

    @RequestMapping(value="/getByRole/{role}",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<UserDTO>> findUsersByRole(@RequestBody RoleDTO aRole){
        return new ResponseEntity<>(userService.findUsersByRole(aRole),HttpStatus.OK);
    }

    //CREATE & EDIT
    @RequestMapping(value="/saveUser",method = RequestMethod.POST, consumes ="application/json", produces = "application/json")
    @ResponseBody
    public ResponseEntity<UserDTO> saveUser(@RequestBody UserDTO aUserDTO){
        return new ResponseEntity<>(userService.saveUser(aUserDTO),HttpStatus.OK);
    }

    //CREATE & EDIT
    @RequestMapping(value="/changeUser",method = RequestMethod.PUT,consumes = "aplication/json",produces = "appliaction/json")
    @ResponseBody
    public ResponseEntity<UserDTO> updateUser(@RequestBody UserDTO aUserDTO){
        return new ResponseEntity<>(userService.updateUser(aUserDTO),HttpStatus.OK);
    }

    @RequestMapping(value="/changeActivity/{id},{active}",method = RequestMethod.POST,consumes = "aplication/json",produces = "appliaction/json")
    @ResponseBody
    public ResponseEntity<UserDTO> updateUserActivity(@PathVariable("id") Long aId ,@PathVariable("active") Boolean aActive){
        return new ResponseEntity<UserDTO>(userService.updateUserActivity(aId,aActive),HttpStatus.OK);
    }
    @RequestMapping(value="/changeLogin/{id},{login}", method = RequestMethod.POST,consumes = "aplication/json",produces = "appliaction/json")
    @ResponseBody
    public ResponseEntity<UserDTO> updateUser(@PathVariable("id")Long aId, @PathVariable("login") String aLogin){
        return new ResponseEntity<>(userService.updateUserLogin(aId,aLogin),HttpStatus.OK);
    }

    @RequestMapping(value="/changeEmail/{id},{email}", method = RequestMethod.POST,consumes = "aplication/json",produces = "appliaction/json")
    @ResponseBody
    public ResponseEntity<UserDTO> updateUserEmail(@PathVariable("id")Long aId, @PathVariable("email") String aEmail){
        return new ResponseEntity<>(userService.updateUserEmail(aId,aEmail),HttpStatus.OK);
    }

    @RequestMapping(value="/addPermsissionToUser/{id}", method = RequestMethod.POST,consumes = "aplication/json",produces = "appliaction/json")
    @ResponseBody
    public ResponseEntity<UserDTO> updatePermissionListForUser(@PathVariable("id")Long aId, @RequestBody PermissionDTO aPermissionDTO) {
        return new ResponseEntity<>(userService.updatePermissionsListForUser(aId,aPermissionDTO),HttpStatus.OK);
    }

    @RequestMapping(value="/addProjectToUser/{id}", method = RequestMethod.POST,consumes = "aplication/json",produces = "appliaction/json")
    @ResponseBody
    public ResponseEntity<UserDTO> updateProjectListForUser(@PathVariable("id") Long aId, @RequestBody ProjectDTO aProjectDTO){
        return new ResponseEntity<>(userService.updateProjectListForUser(aId, aProjectDTO),HttpStatus.OK);
    }


    //DELETE
    @RequestMapping(value="/removeUserById/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public ResponseEntity<UserDTO> deleteUser(@PathVariable("id") Long aId){
        userService.deletUser(aId);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}
