package com.uwm.projektz.attachment.repository;

import com.uwm.projektz.attachment.ob.AttachmentOB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */
@Repository
public interface IAttachmentRepository extends JpaRepository<AttachmentOB,Long> {
}
