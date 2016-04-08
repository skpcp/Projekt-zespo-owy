package com.uwm.projektz.ob;
import java.util.Date;

/**
 * Created by wojni on 10.03.2016.
 */
public class HistoryOB extends BaseOB {
    HistoryType typ;
    TicketOB ticket;
    UserOB user;
    String description;
    Date date;


    public HistoryOB(HistoryType typ, TicketOB ticket, UserOB user, String description, Date date)
    {
        this.typ = typ;
        this.ticket = ticket;
        this.user = user;
        this.description = description;
        this.date = date;

    }
}
