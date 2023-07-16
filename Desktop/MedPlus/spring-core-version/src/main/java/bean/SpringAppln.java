package bean;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAppln {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Spring.xml");
		Employee empl = ctx.getBean("employee", Employee.class);
	empl.setEmpname("sachin");
	empl.setEmpno(1234);
	empl.setLoc("hyderabad");
		
		System.out.println(empl.getEmpno() + " " + empl.getEmpname() + " " + empl.getLoc() + " "
				+ empl.getAddress().getStreet() + " " + empl.getAddress().getPincode());
		Employee emp2 = ctx.getBean("employee",Employee.class);
		
		System.out.println(emp2.getEmpno() + " " + emp2.getEmpname() + " " + emp2.getLoc() + " "
				+ emp2.getAddress().getStreet() + " " + emp2.getAddress().getPincode());
		ctx.close();
	}
	
}
