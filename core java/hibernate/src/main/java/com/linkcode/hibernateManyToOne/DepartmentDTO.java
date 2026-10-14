package com.linkcode.hibernateManyToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDTO {

    @Id
    private int deptId;

    private String name;
    private String location;
    private String manager;
}