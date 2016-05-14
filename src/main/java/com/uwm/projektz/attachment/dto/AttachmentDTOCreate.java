package com.uwm.projektz.attachment.dto;

import com.uwm.projektz.enums.Type;
import io.swagger.annotations.ApiModel;

import java.io.Serializable;

/**
 * Created by Tomasz Komoszeski on 2016-05-11.
 */

@ApiModel
public class AttachmentDTOCreate implements Serializable {
   private Long id;
   private Type type;
   private String name;
   private String file_name;
   private String mine_type;
   private Long binary;


    public AttachmentDTOCreate() {
    }

    public AttachmentDTOCreate(Long id, Type type, String name, String file_name, String mine_type, Long binary) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.file_name = file_name;
        this.mine_type = mine_type;
        this.binary = binary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public String getMine_type() {
        return mine_type;
    }

    public void setMine_type(String mine_type) {
        this.mine_type = mine_type;
    }

    public Long getBinary() {
        return binary;
    }

    public void setBinary(Long binary) {
        this.binary = binary;
    }
}
