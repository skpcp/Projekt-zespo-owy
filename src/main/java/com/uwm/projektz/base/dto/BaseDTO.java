package com.uwm.projektz.base.dto;

import java.io.Serializable;
import java.util.Date;

public class BaseDTO implements Serializable {
    private Long id;
    private Date techDate;

    public BaseDTO(Long id, Date techDate) {
        this.id = id;
        this.techDate = techDate;
    }

    public Date getTechDate() {
        return techDate;
    }

    public void setTechDate(Date techDate) {
        this.techDate = techDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}

