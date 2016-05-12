package com.uwm.projektz.attachment.repository;

import com.uwm.projektz.attachment.ob.AttachmentOB;
import com.uwm.projektz.enums.Type;
import com.uwm.projektz.user.dto.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */
@Repository
public interface IAttachmentRepository extends JpaRepository<AttachmentOB,Long> {
    @Query("SELECT a FROM AttachmentOB a WHERE a.user.id = ?1")
    List<AttachmentOB> findAllAttachmentsOfUser (Long aUserID);
    @Query("SELECT a FROM AttachmentOB a WHERE a.name = ?1")
    List<AttachmentOB> findAttachmentByName (String aName);
    @Query("SELECT a FROM AttachmentOB a WHERE a.file_name = ?1")
    List<AttachmentOB> findAttachmentByFileName (String aFileName);
    @Query("SELECT a FROM AttachmentOB a WHERE a.mine_type = ?1")
    List<AttachmentOB> findAttachmentByMineType (String aMineType);
    @Query("SELECT a FROM AttachmentOB a WHERE a.mine_type = ?1 AND a.name = ?2")
    List<AttachmentOB> findAttachmentByMineTypeAndName (String aMineType,String aName);
    @Query("SELECT a FROM AttachmentOB a WHERE a.type= ?1")
    List<AttachmentOB> findAttachmentByType (Type aType);
}
