package com.dozee.userdetails.repository;

import com.dozee.userdetails.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, String> {
    Optional<Department> findByNameAndRole(String name, String role);
}
