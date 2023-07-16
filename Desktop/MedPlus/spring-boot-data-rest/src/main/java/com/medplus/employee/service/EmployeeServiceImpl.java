package com.medplus.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.medplus.employee.dao.EmployeeDao;
import com.medplus.employee.dto.EmployeeDto;
import com.medplus.employee.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeDao dao;
	@Override
	public void addEmployee(Employee employee) {
		dao.save(employee);
	}
	
	@Override
	public List<Employee> getEmployeeLIst() {
		return dao.findAll();
	}

	@Override
	public Optional<Employee> getEmployeeById(int empno) {
		return dao.findById(empno);
	}

	@Override
	public void deleteEmployee(int empcode) {
          dao.deleteById(empcode);		
	}

	@Override
	public void updateEmployee(EmployeeDto employeeDto) {
		
	}

	@Override
	public List<Employee> getEmployeesByJob(String job) {
		return null;
	}

	@Override
	public Page<Employee> getAllEmployee(int offset, int limit) {
		return dao.findAll(PageRequest.of(offset, limit));
	}
	
}
