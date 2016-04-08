package com.uwm.projektz.ob;
/**
 * Created by wojni on 11.03.2016.
 */
public class TicketOB extends BaseOB{
    TicketType typ;
    String description;
    PriorityOB priority;
    ProjectOB project;



    public TicketOB(TicketType typ, String description, PriorityOB priority, ProjectOB project)
    {
        this.typ = typ;
        this.description = description;
        this.priority = priority;
        this.project = project;
    }
}


