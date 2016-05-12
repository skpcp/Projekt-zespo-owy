package com.uwm.projektz.role.api;

import com.uwm.projektz.permission.dto.PermissionDTO;
import com.uwm.projektz.role.dto.RoleDTO;
import com.uwm.projektz.role.service.IRoleService;
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
@RequestMapping(value = "/projektz/roles")
public class RoleController {

    @Autowired
    IRoleService roleService;

    @RequestMapping(value = "getById/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<RoleDTO> findRoleById(@PathVariable("id") Long aId){
        return new ResponseEntity<>(roleService.findPRoleById(aId), HttpStatus.OK);
    }

    @RequestMapping(value="/getAll", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<RoleDTO>> findAllRole(){
        return new ResponseEntity<>(roleService.findAllRole(),HttpStatus.OK);
    }

    @RequestMapping(value="/getByName/{name}",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<RoleDTO> findRoleByName(@PathVariable("name") String aName){
        return new ResponseEntity<>(roleService.findByName(aName),HttpStatus.OK);
    }

//    @RequestMapping(value ="/saveRole", method = RequestMethod.POST,consumes ="application/json", produces = "application/json")
//    @ResponseBody
//    public ResponseEntity<RoleDTO> saveRole(@RequestBody RoleDTO aRole){
//        return new ResponseEntity<>(roleService.saveRole(aRole),HttpStatus.OK);
//    }

    @RequestMapping(value= "/removeRoleById/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public ResponseEntity<RoleDTO> deleteRole(@PathVariable("id")Long aId)
    {
        roleService.deleteRoleById(aId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
