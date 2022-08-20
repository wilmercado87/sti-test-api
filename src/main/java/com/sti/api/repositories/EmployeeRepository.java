package com.sti.api.repositories;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.sti.api.model.Employee;

public interface EmployeeRepository extends Repository<Employee, Long>{

	List<Employee> findAll();
	
	Employee findById(Long id);

}
