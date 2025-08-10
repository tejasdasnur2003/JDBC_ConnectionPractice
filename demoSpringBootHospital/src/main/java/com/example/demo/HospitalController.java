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
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class HospitalController {
	
	@Autowired
	HospitalRepository hospitalRepository;
	
	@GetMapping("/test")
		public String testMethod()
		{
			
			try {
				
			}
			catch(Exception e)
			{
				log.error("This is Log.error");
			}
			return "This is Hospital's Test Method";
		}
		@PostMapping("/insert")
		public String insertData(@RequestBody HospitalEntity hospitalEntity)
		{
			hospitalRepository.save(hospitalEntity);
			log.info("Data inserted successfully"+hospitalEntity.toString());
			
			return "Insert Successfully";
		}
		
		@GetMapping("/get")
		public List<HospitalEntity>getData()
		{
			hospitalRepository.findAll();
			return hospitalRepository.findAll();
		}
		@PutMapping("/update/{id}")
		public  String updateData(@RequestBody HospitalEntity hospitalEntity)
		
		{
			hospitalRepository.save(hospitalEntity);
			return "Record Upadated successfully";
		}
		@GetMapping("/get/{id}")
		public Optional<HospitalEntity> getData1(@PathVariable long id)
		{
			hospitalRepository.findById(id).orElseThrow(()-> new PatientNotFoundException());
			
			return hospitalRepository.findById(id);
		}
		@DeleteMapping("delete/{id}")
		public String deleteData(@PathVariable long id)
		{
			hospitalRepository.deleteById(id);
			return "Record Deleted Successfully";
		}
		/*@GetMapping("/getnum/{num}")
		public void getdata2(@PathVariable int num){
			
			try
			{
				int result=num/0;
			}
			catch(Exception e)
			{
				log.error("Invalid result");
			}
			
		}*/
		@GetMapping("/getnum/{num}")
		public ResponseEntity<String> getdata2(@PathVariable int num) {    //ResponseEntity to return a meaningful HTTP response.
		    try {
		        int result = 20 / num;
		        return ResponseEntity.ok("Result: " + result);
		    } catch (ArithmeticException e) {
		        log.error("Division by zero error");
		        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: Division by zero is not allowed.");
		    }
		}

	}



