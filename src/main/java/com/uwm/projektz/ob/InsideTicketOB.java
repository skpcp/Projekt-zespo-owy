package com.uwm.projektz.ob;
/**
 * Created by wojni on 11.03.2016.
 */
public class InsideTicketOB extends BaseOB {
    TicketType typ;
    String description;
    PriorityOB priority;
    ProjectOB project;
    TicketOB Ticket;



    public InsideTicketOB(TicketType typ, String description, PriorityOB priority, ProjectOB project, TicketOB Ticket)
    {
        this.typ = typ;
        this.description = description;
        this.priority = priority;
        this.project = project;
        this.Ticket = Ticket;
    }
}
