package org.springDemo.SpringDemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class test {
	public static void main(String[] args) {  
	   ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
	    Student st=(Student)context.getBean("org.springDemo.SpringDemo.student1");  
	    System.out.println(st);;  
}
}
	
