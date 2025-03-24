package com.example.hr_portal.service;

import com.example.hr_portal.model.Employee;
import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Optional<Employee> getEmployeeById(Integer empId);
    Employee addEmployee(Employee employee);
    Employee updateEmployee(Integer empId, Employee employee);
    void deleteEmployee(Integer empId);
}
