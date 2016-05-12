package com.uwm.projektz.binary.api;

import com.uwm.projektz.binary.dto.BinaryDTO;
import com.uwm.projektz.binary.dto.BinaryDTOId;
import com.uwm.projektz.binary.service.IBinaryService;
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
@RequestMapping(value="/projektz/binaries")
public class BinaryController {

    @Autowired
    IBinaryService binaryService;

    @RequestMapping(value = "getBinaryById/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<BinaryDTO> findBinaryById(@PathVariable("id") Long aId){
        return new ResponseEntity<>(binaryService.findBinaryById(aId), HttpStatus.OK);
    }

    @RequestMapping(value="/getAllBinaries", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<BinaryDTO>> findAllBinary(){
        return new ResponseEntity<>(binaryService.findAllBinary(),HttpStatus.OK);
    }
//
//
//
    @RequestMapping(value ="/saveBinary", method = RequestMethod.POST,consumes ="application/json", produces = "application/json")
    @ResponseBody
    public ResponseEntity<BinaryDTOId> saveBinary(@RequestBody BinaryDTO aBinaryDTO){
        return new ResponseEntity<>(binaryService.saveBinary(aBinaryDTO),HttpStatus.OK);
    }

    @RequestMapping(value= "/removeBinaryById/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public ResponseEntity<BinaryDTO> deleteBinary(@PathVariable("id")Long aId)
    {
        binaryService.deleteBinaryById(aId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
