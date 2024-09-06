package com.mike.leansp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mike.leansp.entity.Department;

@Repository
public interface DepertmentRepository  extends JpaRepository<Department,Long>{

    public Department findBydepartmentName(String departmentName);
}
