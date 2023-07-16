package core;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {
@GetMapping
public String getAll()
{
	return "getAll() method";
}
@GetMapping("/{id}")
public String getByID(@PathVariable("id") int id)
{
	return "getById() method "+id;
}
@PostMapping
public String add()
{
	return "Add() method";
}
@PutMapping
public String update()
{
	return "update() method";
}
@DeleteMapping ("/delete/{id}")
public String delete (@PathVariable ("id") int id)
{
	return "delete() method "+ id;
}
}
