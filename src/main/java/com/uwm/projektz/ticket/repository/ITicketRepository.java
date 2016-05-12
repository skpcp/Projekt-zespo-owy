package com.uwm.projektz.ticket.repository;

import com.uwm.projektz.enums.TicketType;
import com.uwm.projektz.enums.Type;
import com.uwm.projektz.priority.ob.PriorityOB;
import com.uwm.projektz.ticket.ob.TicketOB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */
@Repository
public interface ITicketRepository extends JpaRepository<TicketOB,Long> {
    @Query("SELECT t FROM TicketOB t WHERE t.kind = ?1")
    List<TicketOB> findByTicketType (TicketType type);
    @Query("SELECT t FROM TicketOB t WHERE t.type = ?1")
    List<TicketOB> findByType (Type type);
    @Query("SELECT t FROM TicketOB t WHERE t.user.id = ?1")
    List<TicketOB> findByUser (Long aId);
    @Query("SELECT t FROM TicketOB t WHERE t.priority.id = ?1")
    List<TicketOB> findByPriority (Long aId);
    @Query("SELECT t FROM TicketOB t WHERE t.project.id = ?1")
    List<TicketOB> findByProject (Long aId);

}
