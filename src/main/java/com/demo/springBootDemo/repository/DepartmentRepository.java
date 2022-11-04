package com.demo.springBootDemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.springBootDemo.entity.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long> {
    
}
