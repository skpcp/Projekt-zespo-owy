package com.uwm.projektz.permission.repository;

import com.uwm.projektz.permission.ob.PermissionOB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */

@Repository
public interface IPermissionRepository extends JpaRepository<PermissionOB,Long> {
}
