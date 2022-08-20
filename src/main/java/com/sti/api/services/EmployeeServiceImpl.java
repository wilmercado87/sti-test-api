package com.sti.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sti.api.model.Employee;
import com.sti.api.repositories.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;

	@Override
	public List<Employee> getEmployees() {
		return repository.findAll();
	}

	@Override
	public Employee getEmployee(Long id) {
		return repository.findById(id);
	}

}
