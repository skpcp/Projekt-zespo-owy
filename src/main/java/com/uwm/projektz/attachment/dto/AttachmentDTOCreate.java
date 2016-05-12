package com.uwm.projektz.attachment.dto;

import com.uwm.projektz.binary.dto.BinaryDTO;
import com.uwm.projektz.binary.dto.BinaryDTOId;
import com.uwm.projektz.enums.Type;
import com.uwm.projektz.user.dto.UserDTO;
import com.uwm.projektz.user.dto.UserDTOId;
import io.swagger.annotations.ApiModel;

import java.io.Serializable;

/**
 * Created by Tomasz Komoszeski on 2016-05-11.
 */

@ApiModel
public class AttachmentDTOCreate implements Serializable {
    Long id;
    Type type;
    String name;
    String file_name;
    String mine_type;
    Long binaryId;
    Long userId;

    public AttachmentDTOCreate() {
    }

    public AttachmentDTOCreate(Long id, Type type, String name, String file_name, String mine_type, Long binaryId, Long userId) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.file_name = file_name;
        this.mine_type = mine_type;
        this.binaryId = binaryId;
        this.userId = userId;
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

    public Long getBinaryId() {
        return binaryId;
    }

    public void setBinaryId(Long binaryId) {
        this.binaryId = binaryId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
