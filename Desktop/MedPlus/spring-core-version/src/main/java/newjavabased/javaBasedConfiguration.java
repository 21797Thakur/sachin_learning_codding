package newjavabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class javaBasedConfiguration {
	@Bean
	public Department newDept() {
		Department department = new Department();
		department.setDeptno(10);
		department.setDeptname("testing");
		return department;
	}
}
