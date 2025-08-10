package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Autowired
	StudentRepository studentRepository;
	@GetMapping ("/test")
	public String testMethod()
	{
		return "This is Test Method";
	}
	@PostMapping("/insert")
	public String insertData(@RequestBody StudentEntity studentEntity)
	{
		studentRepository.save(studentEntity);
		return "Data Saved Successfully";
	}
	@GetMapping("/get")
	public List<StudentEntity>getData()
	{
		studentRepository.findAll();
		return studentRepository.findAll();
	}
	/*@PutMapping("/update{id}")
	public  String updateData(@RequestBody StudentEntity studentEntity)
	
	{
		studentRepository.save(studentEntity);
		return "Record Upadated successfully";
	}
	*/
	@PutMapping("/update/{id}")
	public  String updateData(@RequestBody StudentEntity studentEntity)
	
	{
		studentRepository.save(studentEntity);
		return "Record Upadated successfully";
	}
	@GetMapping("/get/{id}")
	public Optional<StudentEntity> getData1(@PathVariable long id)
	{
		studentRepository.findById(id);
		return studentRepository.findById(id);
	}
	/*@PutMapping("/update1/{id}")
	public  String updateData1(@RequestBody StudentEntity studentEntity)
	{
		studentRepository.save(studentEntity);
		return "RECORD UPDATED SUCCESSFULLY";
	}*/
	@DeleteMapping("/delete/{id}")
	public String deleteData(@PathVariable long id)
	{
		studentRepository.deleteById(id);
		return "Record Deleted Successfully";
	}
	@PutMapping("/update3/{id}")
	public Optional<StudentEntity>updateData(@RequestBody StudentEntity studentEntity,@PathVariable long id)
	{
		studentRepository.save(studentEntity);
		return studentRepository.findById(id);
	}

}
