package com.uwm.projektz.priority.dto;

import com.uwm.projektz.base.dto.BaseDTO;
import io.swagger.annotations.ApiModel;

import java.util.Date;

/**
 * Created by wojni on 10.03.2016.
 */

@ApiModel
public class PriorityDTO extends BaseDTO {
    String name;
    String responseTime;

    public PriorityDTO() {
    }

    public PriorityDTO(Long id, Date techdate, String name, String responseTime)
    {
        super(id,techdate);
        this.name = name;
        this.responseTime = responseTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(String responseTime) {
        this.responseTime = responseTime;
    }
}
