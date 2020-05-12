package com.example.codeclan.One.To.Many.and.Many.to.Many_Demo.repositories;

import com.example.codeclan.One.To.Many.and.Many.to.Many_Demo.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
