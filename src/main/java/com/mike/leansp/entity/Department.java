package com.mike.leansp.entity;



import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {

    // public Long getDerpamentId() {
    //     return this.derpamentId;
    // }

    // public void setDerpamentId(Long derpamentId) {
    //     this.derpamentId = derpamentId;
    // }

    // public String getDepartmentName() {
    //     return this.departmentName;
    // }

    // public void setDepartmentName(String departmentName) {
    //     this.departmentName = departmentName;
    // }

    // public String getDerpatementAddress() {
    //     return this.derpatementAddress;
    // }

    // public void setDerpatementAddress(String derpatementAddress) {
    //     this.derpatementAddress = derpatementAddress;
    // }

    // public String getDepartmentCode() {
    //     return this.departmentCode;
    // }

    // public void setDepartmentCode(String departmentCode) {
    //     this.departmentCode = departmentCode;
    // }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long derpamentId;
    
    @NotBlank(message = "Departmernt Name is rquired")
    @Length(max = 10, min = 5)

    
    private String departmentName;
    
    private String derpatementAddress;

    private String  departmentCode;

    // public Department(Long derpamentId, String departmentName, String derpatementAddress, String departmentCode) {
    //     this.derpamentId = derpamentId;
    //     this.departmentName = departmentName;
    //     this.derpatementAddress = derpatementAddress;
    //     this.departmentCode = departmentCode;
    // }

    // public Department() {
    // }

    // @Override
    // public String toString() {
    //     return "{" +
    //         " derpamentId='" + getDerpamentId() + "'" +
    //         ", departmentName='" + getDepartmentName() + "'" +
    //         ", derpatementAddress='" + getDerpatementAddress() + "'" +
    //         ", departmentCode='" + getDepartmentCode() + "'" +
    //         "}";
    // }

}
