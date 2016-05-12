package com.uwm.projektz.user.repository;

import com.uwm.projektz.attachment.ob.AttachmentOB;
import com.uwm.projektz.project.ob.ProjectOB;
import com.uwm.projektz.role.ob.RoleOB;
import com.uwm.projektz.user.ob.UserOB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */

@Repository
public interface IUserRepository extends JpaRepository<UserOB,Long> {
    @Query("SELECT u FROM UserOB u WHERE u.active = ?1")
    List<UserOB> findUserByActivity (Boolean aActive);
    @Query("SELECT u FROM UserOB u WHERE u.login = ?1")
    UserOB findUserByLogin (String aLogin);
    @Query("SELECT u FROM UserOB u WHERE u.email LIKE ?1")
    UserOB findUserByEmail (String aEmail);
    @Query("SELECT u FROM UserOB u WHERE u.name = ?1")
    List<UserOB> findUserByName (String aName);
    @Query("SELECT u FROM UserOB u WHERE u.surname = ?1")
    List<UserOB> findUserBySurname (String aSurname);
    @Query("SELECT u FROM UserOB u WHERE u.name = ?1 AND u.surname = ?2")
    List<UserOB> findUserByNameAndSurname (String aName, String aSurname);
    @Query("SELECT u FROM UserOB u WHERE u.role.name = ?1")
    List<UserOB> findUserByRole(String aRoleOB);


}
