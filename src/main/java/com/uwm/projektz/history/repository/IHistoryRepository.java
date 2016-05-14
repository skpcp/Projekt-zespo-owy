package com.uwm.projektz.history.repository;

import com.uwm.projektz.history.ob.HistoryOB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */
@Repository
public interface IHistoryRepository extends JpaRepository<HistoryOB,Long> {
    @Query("SELECT h FROM HistoryOB h WHERE h.date = ?1 AND h.user.id = ?2")
    List<HistoryOB> findHistoryByDateAndUser (Date aDate, Long aId);
    @Query("SELECT h FROM HistoryOB h WHERE h.date = ?1")
    List<HistoryOB> findHistoryByDate (Date aDate);
    @Query("SELECT h FROM HistoryOB h WHERE h.user.id = ?1")
    List<HistoryOB> findHistoryByUser (Long aId);
}
