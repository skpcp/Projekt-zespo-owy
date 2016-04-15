package com.uwm.projektz.ob;

import javax.persistence.*;
import java.util.List;

/**
 * Created by wojni on 11.03.2016.
 */
@Entity
@Table(name = "permissions")
@SequenceGenerator(initialValue = 1,name = "SEQ",sequenceName = "GEN_PERMISSION_ID")
public class PermissionOB extends BaseOB{
    String name;
    public PermissionOB() {
    }

    public PermissionOB(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
