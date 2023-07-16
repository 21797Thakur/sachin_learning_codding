package com.medplus.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.medplus.employee.dto.EmployeeDto;
import com.medplus.employee.entity.Employee;

public interface EmployeeService {

	void addEmployee(Employee employee);
	List<Employee>  getEmployeeLIst();
	Optional<Employee> getEmployeeById(int empno);
	void deleteEmployee(int empcode);
	void updateEmployee(EmployeeDto employeeDto);
	List<Employee> getEmployeesByJob(String job);
	public Page<Employee> getAllEmployee(int offset ,int limit);
}
