package com.be.kafkasample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.be.kafkasample.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
