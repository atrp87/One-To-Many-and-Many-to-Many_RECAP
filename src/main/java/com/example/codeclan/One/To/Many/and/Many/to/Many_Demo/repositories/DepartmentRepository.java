package com.example.codeclan.One.To.Many.and.Many.to.Many_Demo.repositories;

import com.example.codeclan.One.To.Many.and.Many.to.Many_Demo.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
