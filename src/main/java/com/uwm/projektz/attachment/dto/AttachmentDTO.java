package com.uwm.projektz.attachment.dto;

import com.uwm.projektz.base.dto.BaseDTO;
import com.uwm.projektz.binary.dto.BinaryDTO;
import com.uwm.projektz.enums.Type;
import com.uwm.projektz.user.dto.UserDTO;
import io.swagger.annotations.ApiModel;

import java.util.Date;

@ApiModel
public class AttachmentDTO extends BaseDTO {
    Type type;
    String name;
    String file_name;
    String mine_type;
    BinaryDTO binary;
    UserDTO user;

    public AttachmentDTO(Long id, Date techdate, Type type, String name, String file_name, String mine_type, BinaryDTO binaryOB, UserDTO user)
    {
        super(id,techdate);
        this.type = type;
        this.name=name;
        this.file_name=file_name;
        this.mine_type=mine_type;
        this.binary = binaryOB;
        this.user = user;
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

    public BinaryDTO getBinary() {
        return binary;
    }

    public void setBinary(BinaryDTO binary) {
        this.binary = binary;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

}

