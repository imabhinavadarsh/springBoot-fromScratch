package com.abhinavproject.employeemanagementsystem.Repository;

import com.abhinavproject.employeemanagementsystem.Entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employees, Long> {

}
