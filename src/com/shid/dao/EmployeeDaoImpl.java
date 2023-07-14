package com.shid.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shid.model.Employee;

@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public void saveEmployee(Employee employee) {
		getSession().persist(employee);
	}
	
	public void updateEmployee(Employee employee){
		getSession().update(employee);
	}

	@Override
	public List<Employee> getEmployeeList() {
		return getSession().createQuery("from Employee").list();
	}
	
}
