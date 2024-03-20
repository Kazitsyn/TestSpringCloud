package com.example.testSpringDataJPA.repository;

import com.example.testSpringDataJPA.model.Project;
import com.example.testSpringDataJPA.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
