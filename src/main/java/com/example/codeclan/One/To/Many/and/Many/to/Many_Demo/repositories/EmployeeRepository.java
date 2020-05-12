package com.example.codeclan.One.To.Many.and.Many.to.Many_Demo.repositories;

import com.example.codeclan.One.To.Many.and.Many.to.Many_Demo.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
