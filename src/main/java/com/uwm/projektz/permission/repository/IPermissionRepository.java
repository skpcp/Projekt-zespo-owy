package com.uwm.projektz.permission.repository;

import com.uwm.projektz.permission.ob.PermissionOB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.security.Permission;
import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */

@Repository
public interface IPermissionRepository extends JpaRepository<PermissionOB,Long> {
    @Query("SELECT p FROM PermissionOB p WHERE p.name LIKE ?1")
    PermissionOB findPermissionByName (String aName);
}
