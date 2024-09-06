package com.mike.leansp.service;



import java.util.List;

import com.mike.leansp.entity.Department;
import com.mike.leansp.error.DepartmentNotFoundException;

public interface DepartmentService {

    Department saveDepartment(Department department);

    List<Department> getAllDepartment();

    Department fetchDepartmentbyId(Long departmentId) throws DepartmentNotFoundException;

    void deletedepartment(Long departmentId);

    Department updateDepartment(Long departmentId, Department department);

    Department fetchDepartmentbyName(String departmentName);



  

}
