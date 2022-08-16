package com.devdutt.employee.vo;

import com.devdutt.employee.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplateVO {

    private Employee employee;
    private Department department;
}
