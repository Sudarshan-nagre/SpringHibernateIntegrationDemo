package com.shid.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shid.dao.EmployeeDao;
import com.shid.model.Employee;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao dao;
	
	public void saveEmployee(Employee employee) {
		dao.saveEmployee(employee);
	}

	public void updateEmployee(Employee employee){
		dao.updateEmployee(employee);
	}

	@Override
	public List<Employee> getEmployeeList() {
		return dao.getEmployeeList();
	}
}
