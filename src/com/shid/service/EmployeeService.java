package com.shid.service;

import java.util.List;

import com.shid.model.Employee;

public interface EmployeeService {

	void saveEmployee(Employee employee);

	void updateEmployee(Employee employee);
	
	List<Employee> getEmployeeList();
}
