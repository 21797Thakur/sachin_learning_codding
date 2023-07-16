package com.medplus.employee.test;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.medplus.employee.dao.EmployeeDao;
import com.medplus.employee.entity.Employee;


@SpringBootTest
public class EmployeeDaoTest {
@Autowired
EmployeeDao dao;
@Test
public void testFindByIdFalse() {
	Optional<Employee> employee =dao.findById(12);
	assertFalse(employee.isEmpty());
}
}
