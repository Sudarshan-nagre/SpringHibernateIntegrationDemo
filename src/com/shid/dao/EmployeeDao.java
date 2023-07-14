package com.shid.dao;

import java.util.List;

import com.shid.model.Employee;

public interface EmployeeDao {

	void saveEmployee(Employee employee);
	
	void updateEmployee(Employee employee);
	
	List<Employee> getEmployeeList();
}
