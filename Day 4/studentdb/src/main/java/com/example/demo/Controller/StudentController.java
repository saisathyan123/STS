package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Student;
import com.example.demo.Service.StudentService;

@RestController
public class StudentController {
@Autowired
StudentService service;
@PostMapping("/student")
public String CreateStudent(Student student)
{
	return service.addStudent(student);
}
@GetMapping("/student")
public List<Student> myFun(){
	return service.displayStudent();
}
@PutMapping("/student")
public String UpdateStudent(Student student)
{
	return service.UpdateStudent(student);
}
@DeleteMapping("/student/{id}")
public String DeleteStudent(@PathVariable int id)
{
	return service.DeleteStudent(id);
}
 
}
