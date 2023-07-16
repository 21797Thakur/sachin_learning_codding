package com.medplus.employee.controller;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.medplus.employee.entity.Employee;
import com.medplus.employee.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeService service;

	@PostMapping
	public ResponseEntity<String> addEmployee(@RequestBody Employee employee) {
		service.addEmployee(employee);
		return new ResponseEntity<>("inserted", HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Employee>> getEmployeeList(){
		return new ResponseEntity<>(service.getEmployeeLIst(),HttpStatus.OK);
	}
	
	@PostMapping("/getById/{empno}")
	public ResponseEntity<Optional<Employee>> getBydId(@PathVariable ("empno") int empno )
	{
		return new ResponseEntity<>(service.getEmployeeById(empno),HttpStatus.OK);
	}
	
	@PostMapping("/getAllEmployee")
	public ResponseEntity<Page<Employee>> getAllEmployee(@RequestParam("offset") int offset, @RequestParam("limit") int limit )
	{
		Page<Employee> temp = service.getAllEmployee(offset,limit);
 		return new ResponseEntity<>(temp,HttpStatus.OK);
	}
	
}
