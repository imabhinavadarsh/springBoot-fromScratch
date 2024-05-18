package com.abhinavproject.employeemanagementsystem.Service;

import com.abhinavproject.employeemanagementsystem.Entity.Employees;

import java.util.List;

public interface EmployeeService {
    List<Employees> getAllEmployees();
    void saveEmployee(Employees employees);
    Employees getEmployeeById(Long Id);
    void deleteEmployeeById(Long Id);
}
