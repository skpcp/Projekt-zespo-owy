package com.uwm.projektz.attachment.dto;

import io.swagger.annotations.ApiModel;

import java.io.Serializable;

/**
 * Created by Tomasz Komoszeski on 2016-06-08.
 */
@ApiModel
public class AttachmentDTOtoAdd implements Serializable {
    private  Long id;

    public AttachmentDTOtoAdd() {
    }

    public AttachmentDTOtoAdd(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
