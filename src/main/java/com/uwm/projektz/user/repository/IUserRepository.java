package com.uwm.projektz.user.repository;

import com.uwm.projektz.user.ob.UserOB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */

@Repository
public interface IUserRepository extends JpaRepository<UserOB,Long> {
}
