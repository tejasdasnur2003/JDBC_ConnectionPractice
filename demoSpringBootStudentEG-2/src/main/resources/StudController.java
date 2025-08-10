//package com.example.demo;
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
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class StudController {
	
	@Autowired
	StudRepository studRepository;
	
	@GetMapping("/test")
		public String testMethod()
		{
			
			try {
				
			}
			catch(Exception e)
			{
				log.error("This is Log.error");
			}
			return "This is stud Test Method";
		}
		@PostMapping("/insert")
		public String insertData(@RequestBody Leads lead)
		{
			studRepository.save(lead);
			log.info("Data inserted successfully"+lead.toString());
			
			return "Insert Successfully";
		}
		@PostMapping(/updateleadapi)
		public void updateapi(@RequestBody Leads lead)
		{
			String newName="Mr."+lead.getFname();
			studRepository.save(lead);
		}
		
		
	}



