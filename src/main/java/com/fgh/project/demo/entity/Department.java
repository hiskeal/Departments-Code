package com.fgh.project.demo.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "departments")
// Class
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;
    @Column(name="department_name")
    private String departmentName;
    @Column(name="department_address")
    private String departmentAddress;
    @Column(name="department_code")
    private String departmentCode;
}