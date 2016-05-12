package com.uwm.projektz.binary.dto;

import com.uwm.projektz.base.dto.BaseDTO;
import io.swagger.annotations.ApiModel;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Tomasz Komoszeski on 2016-05-11.
 */
@ApiModel
public class BinaryDTOId extends BaseDTO {

    public BinaryDTOId() {
    }

    public BinaryDTOId(Long id, Date techDate) {
        super(id, techDate);
    }


}
