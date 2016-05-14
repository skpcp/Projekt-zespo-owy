package com.uwm.projektz.ticket.dto;

import io.swagger.annotations.ApiModel;

import java.io.Serializable;

/**
 * Created by Tomasz Komoszeski on 2016-05-14.
 */
@ApiModel
public class TicketDTOHistory implements Serializable {
    private Long id;
    private Long history;

    public TicketDTOHistory() {
    }

    public TicketDTOHistory(Long id, Long history) {
        this.id = id;
        this.history = history;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHistory() {
        return history;
    }

    public void setHistory(Long history) {
        this.history = history;
    }
}
