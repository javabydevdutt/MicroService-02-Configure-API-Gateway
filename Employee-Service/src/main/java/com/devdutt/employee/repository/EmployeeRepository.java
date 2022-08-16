package com.devdutt.employee.repository;

import com.devdutt.employee.entity.Employee;
import com.devdutt.employee.vo.ResponseTemplateVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee findByEmployeeId(Long employeeId);
}
