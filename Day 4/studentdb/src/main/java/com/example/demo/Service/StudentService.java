package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Student;
import com.example.demo.Repository.StudentRepository;

@Service
public class StudentService {
 @Autowired
 StudentRepository repository;
 public String addStudent(Student student)
 {
	 repository.save(student);
	 return "added";
 }
 public List<Student> displayStudent()
 {
	return repository.findAll(); 
 }
 public String UpdateStudent(Student student)
 {
	 repository.save(student);
	 return "Updated";
 }
 public String DeleteStudent(int id)
 {
	 repository.deleteById(id);
	 return "Deleted";
 }
 
}
