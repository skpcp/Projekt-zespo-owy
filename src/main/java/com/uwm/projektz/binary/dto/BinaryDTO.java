package com.uwm.projektz.binary.dto;

import com.uwm.projektz.base.dto.BaseDTO;
import io.swagger.annotations.ApiModel;

import java.util.Date;

/**
 * Created by wojni on 11.03.2016.
 */

@ApiModel
public class BinaryDTO extends BaseDTO {
    byte[] binary;

    public BinaryDTO() {
    }

    public BinaryDTO(Long id, Date techdate, byte[] binary)
    {
        super(id,techdate);
        this.binary = binary;
    }

    public byte[] getBinary() {
        return binary;
    }

    public void setBinary(byte[] binary) {
        this.binary = binary;
    }
}


