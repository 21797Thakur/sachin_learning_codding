package newjavabased;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaBasedAppn {
	
public static void main(String[] args) {
	AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext(javaBasedConfiguration.class);
	Department dept= ctx.getBean("newDept",Department.class);
	System.out.println(dept.getDeptno() + dept.getDeptname());
}
}
