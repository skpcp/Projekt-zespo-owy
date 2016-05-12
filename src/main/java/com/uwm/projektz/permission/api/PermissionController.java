package com.uwm.projektz.permission.api;

import com.uwm.projektz.permission.dto.PermissionDTO;
import com.uwm.projektz.permission.service.IPermissionService;
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
@RequestMapping(value ="/projektz/permissions")
public class PermissionController {

    @Autowired
    IPermissionService permissionService;


    @RequestMapping(value = "getById/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<PermissionDTO> findPermissionById(@PathVariable("id") Long aId){
        return new ResponseEntity<>(permissionService.findPermissionById(aId), HttpStatus.OK);
    }

    @RequestMapping(value="/getAll", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<PermissionDTO>> findAllPermissions(){
        return new ResponseEntity<>(permissionService.findAllPermission(),HttpStatus.OK);
    }

    @RequestMapping(value="/getByName/{name}",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<PermissionDTO> findPermissionByName(@PathVariable("name") String aName){
        return new ResponseEntity<>(permissionService.findByName(aName),HttpStatus.OK);
    }

    @RequestMapping(value ="/savePermission", method = RequestMethod.POST,consumes ="application/json", produces = "application/json")
    @ResponseBody
    public ResponseEntity<PermissionDTO> savePermission(@RequestBody PermissionDTO aPermission){
        return new ResponseEntity<>(permissionService.savePermission(aPermission),HttpStatus.OK);
    }

    @RequestMapping(value= "/removePermissionById/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public ResponseEntity<PermissionDTO> deletePermission(@PathVariable("id")Long aId)
    {
        permissionService.deletePermissionById(aId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
