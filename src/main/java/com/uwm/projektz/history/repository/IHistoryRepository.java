package com.uwm.projektz.history.repository;

import com.uwm.projektz.history.ob.HistoryOB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */
@Repository
public interface IHistoryRepository extends JpaRepository<HistoryOB,Long> {
}
