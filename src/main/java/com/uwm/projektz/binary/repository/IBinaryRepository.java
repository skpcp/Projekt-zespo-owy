package com.uwm.projektz.binary.repository;

import com.uwm.projektz.binary.ob.BinaryOB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */
@Repository
public interface IBinaryRepository extends JpaRepository<BinaryOB,Long> {
}
