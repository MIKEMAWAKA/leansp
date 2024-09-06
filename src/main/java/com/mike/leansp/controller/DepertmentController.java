package com.mike.leansp.controller;

import com.mike.leansp.error.DepartmentNotFoundException;
import org.springframework.web.bind.annotation.RestController;

import com.mike.leansp.entity.Department;
import com.mike.leansp.service.DepartmentService;

import jakarta.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
public class DepertmentController {

    @Autowired
    private   DepartmentService departmentService;


    private final Logger LOGGER = LoggerFactory.getLogger(DepertmentController.class);


  
    @PostMapping("/department")
    public Department saveDepartment(@Valid @RequestBody Department department){

        LOGGER.info("Inside save Department of DepartmentController");
        return departmentService.saveDepartment(department);

    }


    @GetMapping("/departments")
    public  List<Department> getDepartmentList(){
        LOGGER.info("Inside Get Department of DepartmentController");
        return departmentService.getAllDepartment();
    }



    @GetMapping("/department/{id}")
    public Department getDepartmentById(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException {

        return departmentService.fetchDepartmentbyId(departmentId);



    }


    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){
      departmentService.deletedepartment(departmentId);
      return "Department deleted Successfull!!";



    }

    @PutMapping("/department/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId,@RequestBody Department department ){

        return departmentService.updateDepartment(departmentId,department);


    }

    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName){
        return departmentService.fetchDepartmentbyName(departmentName);

    }



    


}
