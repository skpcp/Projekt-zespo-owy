package com.uwm.projektz.ticket.repository;

import com.uwm.projektz.ticket.ob.TicketOB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */
@Repository
public interface ITicketRepository extends JpaRepository<TicketOB,Long> {
}
