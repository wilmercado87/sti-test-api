package com.sti.api.services;

import java.util.List;

import com.sti.api.model.Employee;

public interface EmployeeService {
	
	List<Employee> getEmployees();
	
	Employee getEmployee(Long id);

}
