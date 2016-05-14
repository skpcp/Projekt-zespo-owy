package com.uwm.projektz.binary.dto;

import io.swagger.annotations.ApiModel;

import java.io.Serializable;

/**
 * Created by Tomasz Komoszeski on 2016-05-14.
 */
@ApiModel
public class BinaryDTOCreate implements Serializable {
    private String binary;

    public BinaryDTOCreate() {
    }

    public BinaryDTOCreate(String binary) {
        this.binary = binary;
    }

    public String getBinary() {
        return binary;
    }

    public void setBinary(String binary) {
        this.binary = binary;
    }
}
