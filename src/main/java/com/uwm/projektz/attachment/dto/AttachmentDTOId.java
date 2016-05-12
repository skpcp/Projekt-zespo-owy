package com.uwm.projektz.attachment.dto;

import io.swagger.annotations.ApiModel;

import java.io.Serializable;

/**
 * Created by Tomasz Komoszeski on 2016-05-12.
 */

@ApiModel
public class AttachmentDTOId implements Serializable {
    Long id;

    public AttachmentDTOId() {
    }

    public AttachmentDTOId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
