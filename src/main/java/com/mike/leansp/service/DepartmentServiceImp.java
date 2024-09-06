package com.mike.leansp.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mike.leansp.entity.Department;
import com.mike.leansp.error.DepartmentNotFoundException;
import com.mike.leansp.repository.DepertmentRepository;

@Service
public class DepartmentServiceImp  implements DepartmentService{

    @Autowired
    private  DepertmentRepository depertmentRepository;

    @Override
    public Department saveDepartment(Department department) {
    

       return  depertmentRepository.save(department);



    }

    @Override
    public List<Department> getAllDepartment() {

        return depertmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentbyId(Long departmentId) throws DepartmentNotFoundException {
       
     Optional<Department> department= depertmentRepository.findById(departmentId);

     if(!department.isPresent()){
        throw new DepartmentNotFoundException("Department Not Available");
     }
     return department.get();
    }

    @Override
    public void deletedepartment(Long departmentId) {
        depertmentRepository.deleteById(departmentId);
    }

    @Override
    public Department updateDepartment(Long departmentId, Department department) {
      Department depdb = depertmentRepository.findById(departmentId).get();

      if(Objects.nonNull(department.getDepartmentName()) &&
      !"".equalsIgnoreCase(department.getDepartmentName())){
        depdb.setDepartmentName(department.getDepartmentName());
      };

      if(Objects.nonNull(department.getDepartmentCode()) &&
      !"".equalsIgnoreCase(department.getDepartmentCode())){
        depdb.setDepartmentCode(department.getDepartmentName());
      };

      if(Objects.nonNull(department.getDerpatementAddress()) &&
      !"".equalsIgnoreCase(department.getDerpatementAddress())){
        depdb.setDerpatementAddress(department.getDerpatementAddress());
      };

      return depertmentRepository.save(depdb);


    }

    @Override
    public Department fetchDepartmentbyName(String departmentName) {
       return depertmentRepository.findBydepartmentName(departmentName);
    }

}
