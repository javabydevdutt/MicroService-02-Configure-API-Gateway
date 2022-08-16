package com.devdutt.department.service;

import com.devdutt.department.entity.Department;
import com.devdutt.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment method of Department Service");
        return departmentRepository.save(department);
    }

    public List<Department> getAllDepartment() {
        log.info("Inside saveDepartment method of Department Service");
        return departmentRepository.findAll();
    }

    public Department getDepartmentById(Long id) {
        log.info("Inside getDepartmentById method of Department Service");
        return departmentRepository.findByDepartmentId(id);
    }
}
