package com.example.demo;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@GetMapping("/test")
	public String testMethod()
	{
		
		try {
			
		}
		catch(Exception e)
		{
			log.error("This is Log.error");
		}
		return "This is Test Method";
	}
	@PostMapping("/insert")
	public String insertData(@RequestBody EmployeeEntity employeeEntity)
	{
		employeeRepository.save(employeeEntity);
		log.info("Data inserted successfully");
		
		return "";
	}
	
	@GetMapping("/get")
	public List<EmployeeEntity>getData()
	{
		employeeRepository.findAll();
		return employeeRepository.findAll();
	}
	@PutMapping("/update/{id}")
	public  String updateData(@RequestBody EmployeeEntity studentEntity)
	
	{
		employeeRepository.save(studentEntity);
		return "Record Upadated successfully";
	}
	@GetMapping("/get/{id}")
	public Optional<EmployeeEntity> getData1(@PathVariable long id)
	{
		employeeRepository.findById(id);
		
		return employeeRepository.findById(id);
	}
	@DeleteMapping("delete/{id}")
	public String deleteData(@PathVariable long id)
	{
		employeeRepository.deleteById(id);
		return "Record Deleted Successfully";
	}
}
