package com.uwm.projektz.ob;
import javax.persistence.*;
/**
 * Created by wojni on 10.03.2016.
 */
@Entity
@Table(name = "priorities")
@SequenceGenerator(initialValue = 1,name = "SEQ",sequenceName = "GEN_PRIORITY_ID")
public class PriorityOB extends BaseOB{
    String name;
    String responseTime;

    public PriorityOB() {
    }

    public PriorityOB(String name, String responseTime)
    {
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
