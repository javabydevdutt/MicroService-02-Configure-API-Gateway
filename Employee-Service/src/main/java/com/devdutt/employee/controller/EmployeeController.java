package com.devdutt.employee.controller;

import com.devdutt.employee.entity.Employee;
import com.devdutt.employee.service.EmployeeService;
import com.devdutt.employee.vo.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/")
    public Employee registerEmployee(@RequestBody Employee employee) {
        log.info("Inside registerEmployee of EmployeeController");
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/{employeeId}")
    public ResponseTemplateVO getEmployeeWithDepartment(@PathVariable Long employeeId) {
        log.info("Inside getEmployeeWithDepartment of EmployeeController");
        return employeeService.fetchEmployeeWithDepartment(employeeId);
    }
}
