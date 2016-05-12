package com.uwm.projektz.priority.repository;

import com.uwm.projektz.priority.ob.PriorityOB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */

@Repository
public interface IPriorityRepository extends JpaRepository<PriorityOB,Long> {
    @Query("SELECT p FROM PriorityOB p WHERE p.name = ?1")
    PriorityOB findPriorityByName (String aName);
}
