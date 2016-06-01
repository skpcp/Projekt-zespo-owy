package com.uwm.projektz.base.dto;

import io.swagger.annotations.ApiModel;

import java.io.Serializable;

/**
 * Created by Tomasz Komoszeski on 2016-06-01.
 */
@ApiModel
public class ResponseDTO implements Serializable {
    private String response;

    public ResponseDTO() {
    }

    public ResponseDTO(String response) {
        this.response = response;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
