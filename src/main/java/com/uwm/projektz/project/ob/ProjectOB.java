package com.uwm.projektz.project.ob;



import com.uwm.projektz.base.ob.BaseOB;
import com.uwm.projektz.priority.ob.PriorityOB;

import javax.persistence.*;
import java.util.Date;


/**
 * Created by wojni on 10.03.2016.
 */
@Entity
@Table(name = "projects")
@SequenceGenerator(initialValue = 1,name = "SEQ",sequenceName = "GEN_PROJECT_ID")
public class ProjectOB extends BaseOB {
    @Column(unique = true)
    String name;
    String descritpion;
    String version;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="PRIORITY_ID", referencedColumnName = "ID")
    PriorityOB priority;

    public ProjectOB(){}

    public ProjectOB(String name, String descritpion, String version, PriorityOB priority) {
        this.name = name;
        this.descritpion = descritpion;
        this.version = version;
        this.priority = priority;
    }

    public ProjectOB(Long id, Date techdate, String name, String descritpion, String version, PriorityOB priority) {
        super(id,techdate);
        this.name = name;
        this.descritpion = descritpion;
        this.version = version;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescritpion() {
        return descritpion;
    }

    public void setDescritpion(String descritpion) {
        this.descritpion = descritpion;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public PriorityOB getPriority() {
        return priority;
    }

    public void setPriority(PriorityOB priority) {
        this.priority = priority;
    }
}
