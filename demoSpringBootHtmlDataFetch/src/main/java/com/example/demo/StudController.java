package com.example.demo;
import java.util.List;
import java.util.Optional;
//import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudController {
	
	@Autowired
	StudRepository studRepository;
	
	@Autowired
	LeadService leadService;
	/*@GetMapping("/test")
		public String testMethod()
		{
	
		return "test Run";
		}*/
	
		@PostMapping("/insert")
		public String insertData(@RequestBody Leads lead)
		{
			leadService.insertData(lead);
			return "Insert Successfully";
		}
		@GetMapping("/get")
		public List<Leads>getData()
		{
			studRepository.findAll();
			return studRepository.findAll();
		}
		@GetMapping("/get/{id}")
		public Optional<Leads> getData1(@PathVariable long id)
		{
			studRepository.findById(id);
			return studRepository.findById(id);
		}
		@PutMapping("/update/{id}")
		public  String updateData(@RequestBody Leads lead)
		
		{
			studRepository.save(lead);
			return "Record Upadated successfully";
		}
		@DeleteMapping("/delete/{id}")
		public String deleteData(@PathVariable long id)
		{
			studRepository.deleteById(id);
			return "Record Deleted Successfully";
		}
		
		
		
	}



