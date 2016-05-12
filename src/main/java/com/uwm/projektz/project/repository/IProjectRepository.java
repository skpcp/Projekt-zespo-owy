package com.uwm.projektz.project.repository;

import com.uwm.projektz.project.ob.ProjectOB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Tomasz Komoszeski on 2016-04-20.
 */
@Repository
public interface IProjectRepository extends JpaRepository<ProjectOB,Long> {
    @Query("SELECT p FROM ProjectOB p WHERE p.name LIKE ?1")
    ProjectOB findProjectByName (String aName);
    @Query("SELECT p FROM ProjectOB p WHERE p.priority.name LIKE ?1")
    List<ProjectOB> findProjectByPriority (String aName);
    @Query("SELECT u.projects FROM UserOB u WHERE u.id = ?1")
    List<ProjectOB> findUserProjects (Long aId);
}
