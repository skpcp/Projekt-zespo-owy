package com.uwm.projektz.ob;
/**
 * Created by wojni on 10.03.2016.
 */
public class ProjectOB extends BaseOB{
    String name;
    String descritpion;
    String version;
    PriorityOB priority;


    public ProjectOB(String name, String desc, String version, PriorityOB priority)
    {
        this.name = name;
        this.descritpion = desc;
        this.version = version;
        this.priority = priority;
    }
}
