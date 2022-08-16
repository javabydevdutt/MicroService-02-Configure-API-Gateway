package com.devdutt.department.controller;

import com.devdutt.department.entity.Department;
import com.devdutt.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department register(@RequestBody Department department) {
        log.info("Inside register method of Department Controller");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/fetchDepartment")
    public List<Department> fetchDepartment(){
        log.info("Inside fetchDepartment method of Department Controller");
        return departmentService.getAllDepartment();
    }

    @GetMapping("/fetchDepartment/{id}")
    public Department fetchDepartmentById(@PathVariable Long id){
        log.info("Inside fetchDepartmentById method of Department Controller");
        return departmentService.getDepartmentById(id);
    }
}
