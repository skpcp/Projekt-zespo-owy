package com.uwm.projektz.role.repository;

import com.uwm.projektz.role.ob.RoleOB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */
@Repository
public interface IRoleRepository extends JpaRepository<RoleOB,Long> {
}
