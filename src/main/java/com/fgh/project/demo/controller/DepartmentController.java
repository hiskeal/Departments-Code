package com.fgh.project.demo.controller;

import com.fgh.project.demo.entity.Department;
import com.fgh.project.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Annotation
@RestController
@RequestMapping("/API")
// Class
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    // Save operation
    @PostMapping("/departments")

    public Department saveDepartment(
            @Validated @RequestBody Department department)
    {
        return departmentService.saveDepartment(department);
    }

    // Read operation
    @GetMapping("/departments")

    public List<Department> fetchDepartmentList()
    {
        return departmentService.fetchDepartmentList();
    }

    // Update operation
    @PutMapping("/departments/{id}")

    public Department
    updateDepartment(@RequestBody Department department,
                     @PathVariable("id") Long departmentId)
    {
        return departmentService.updateDepartment(
                department, departmentId);
    }

    // Delete operation
    @DeleteMapping("/departments/{id}")

    public String deleteDepartmentById(@PathVariable("id")
                                               Long departmentId)
    {
        departmentService.deleteDepartmentById(
                departmentId);
        return "Deleted Successfully";
    }
}
