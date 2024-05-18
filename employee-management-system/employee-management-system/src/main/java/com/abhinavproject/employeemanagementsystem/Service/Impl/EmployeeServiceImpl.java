package com.abhinavproject.employeemanagementsystem.Service.Impl;

import com.abhinavproject.employeemanagementsystem.Entity.Employees;
import com.abhinavproject.employeemanagementsystem.Repository.EmployeeRepository;
import com.abhinavproject.employeemanagementsystem.Service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    private EmployeeRepository employeeRepository;


    @Override
    public List<Employees> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employees employees) {
        this.employeeRepository.save(employees);

    }

    @Override
    public Employees getEmployeeById(Long id) {
        Optional<Employees> optional = employeeRepository.findById(id);
        return optional.orElseThrow(() -> new RuntimeException("Employee Not Found Exception"));
    }

    @Override
    public void deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);
    }
}