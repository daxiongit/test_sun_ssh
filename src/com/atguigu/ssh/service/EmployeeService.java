package com.atguigu.ssh.service;

import java.util.List;

import com.atguigu.ssh.dao.EmployeeDao;
import com.atguigu.ssh.entities.Employee;

public class EmployeeService {
	
	private EmployeeDao employeeDao;
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	public List<Employee> getAll(){
		
		/*  测试没有任何员工信息
		List<Employee> employees = employeeDao.getAll();
		employees.clear();
		return employees;
		*/
		
		return employeeDao.getAll();
	}
	
	public boolean lastNameIsValid(String lastName){
		return employeeDao.getEmployeeByLastName(lastName) == null;
	}
	
	public void saveOrUpdate(Employee employee){
		employeeDao.saveOrUpdate(employee);
	}
	
	public void delete(Integer id){
		employeeDao.delete(id);
	}

	public Employee get(Integer id) {
		return employeeDao.get(id);
	}

}
