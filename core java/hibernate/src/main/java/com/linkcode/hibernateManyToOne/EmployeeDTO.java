package com.linkcode.hibernateManyToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

    @Id
    private int empId;

    private String name;
    private String designation;
    private double salary;

    @ManyToOne
    private DepartmentDTO department;
}