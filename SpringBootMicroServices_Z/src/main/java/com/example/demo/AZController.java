package com.example.demo;

import org.apache.commons.logging.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.Value;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
public class AZController {
	
	//@Value("${laptopStore.url}")
	private String laptopStore;
	
	//@Value("${mobileStore.url}")
	private String  mobileStore;
	
	RestTemplate restTemplate = new RestTemplate();
	@GetMapping("/getlaptop")
	public String retriveLaptop()
	{
		log.info("Laptop 1 laptopStore");
		ResponseEntity<String> responseEntity=restTemplate.getForEntity("http://localhost:8081/get",String.class);
		
		log.info("Laptop 2");
		return responseEntity.getBody();
	}
	@GetMapping("/getmobile")
	public String retriveMobile()
	{
		log.info("Mobile 1 mobileStore");
		ResponseEntity<String> responseEntity=restTemplate.getForEntity("http://localhost:8082/get",String.class);
		
		log.info("Mobile 2");
		return responseEntity.getBody();
	}
	@PostMapping("/insertdata")
	public String insertData()
	{
		log.info("Laptop 1 laptopStore");
		ResponseEntity<String> responseEntity=restTemplate.postForEntity("http://localhost:8081/insert",laptopStore,String.class);
		log.info("Mobile 2");
		return responseEntity.getBody();
	}
	@PutMapping("/updatedata")
	public String updateDataLaptop()
	{
		log.info("Laptop 1 laptopStore");
		restTemplate.put("http://localhost:8081/update",null);
		return "Data of Laptop Store is Updated";
	}
	@PutMapping("/updatedataMobile")
	public String updateDataMobile()
	{
		log.info("Mobile 1 mobileStore");
		restTemplate.put("http://localhost:8081/update","Mobile Store Updated");
		return "Data of Mobile Store is Updated";
	}
	@DeleteMapping("/deletedata")
	public String deleteDataLaptop()
	{
		log.info("Laptop 1 laptopStore");
		restTemplate.delete("http://localhost:8081/delete","Laptop Store deleted");
		return "Data of Laptop Store is Deleted";
	}
	
	@DeleteMapping("/deletedataMobile")
	public String deleteDataMobile()
	{
		log.info("Mobile 1 mobileStore");
		restTemplate.delete("http://localhost:8081/delete","Mobile Store deleted");
		return "Data of Mobile Store is Deleted";
	}
	
	@PostMapping("/insertlaptop/addlap")
	public String insertLaptop()
	{
		System.out.println("LaptopEntity: "+addlap);
		System.out.println("LaptopEntity: "+addlap.toString());
		ResponseEntity<String> responseEntity=restTemplate.getForEntity("http://localhost:8082/insert",String.class);
		return "";
		
	}

}
