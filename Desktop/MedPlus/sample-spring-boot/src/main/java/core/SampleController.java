package core;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
 @RequestMapping ("/welcome")
	public String welcome() {
		return "<h1>"
				+ "Welcome to Spring Boot application"
				+ "</h1>";
	}
  @GetMapping("/hello/{name}")
 public String sayHello(@PathVariable("name") String name)
 {
	 return "hello "+name;
 }
  
  @DeleteMapping
  public String delete() {
	  return "delete anotation";
  }
}
