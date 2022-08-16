package com.devdutt.employee.service;

import com.devdutt.employee.entity.Employee;
import com.devdutt.employee.repository.EmployeeRepository;
import com.devdutt.employee.vo.Department;
import com.devdutt.employee.vo.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Employee saveEmployee(Employee employee) {
        log.info("Inside saveEmployee in EmployeeService");
        return employeeRepository.save(employee);
    }

    public ResponseTemplateVO fetchEmployeeWithDepartment(Long employeeId) {
        log.info("Inside fetchEmployeeWithDepartment in EmployeeService");
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Employee emp = employeeRepository.findByEmployeeId(employeeId);
        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/fetchDepartment/" + emp.getDepartmentId(), Department.class);
        vo.setEmployee(emp);
        vo.setDepartment(department);
        return vo;
    }
}
