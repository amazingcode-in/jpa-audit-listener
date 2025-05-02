package com.amazingcode.in.example.service;

import com.amazingcode.in.example.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);
    EmployeeDto updateEmployee(EmployeeDto employeeDto);
    List<EmployeeDto> getAllEmployees();
    void deleteEmployee(Integer id);
}