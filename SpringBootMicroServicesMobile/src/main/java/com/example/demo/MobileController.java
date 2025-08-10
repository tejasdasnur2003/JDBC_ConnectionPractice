package com.example.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
public class MobileController {
	@GetMapping("/get")
	public String retriveData()
	{
		log.info("Data Recieved");
		return "MobileController --> retriveData() -->\"/get\" ";
	}
	@PostMapping("/insert")
	public String insertData()
	{
		log.info("data inserted");
		return "MobileController --> insertData() --> \"/insert\" ";
	}
	@PutMapping("/update")
	public String updateData()
	{
		log.info("data updated");
		return "MobileController --> updateData() --> \"/update\" ";
	}
	@DeleteMapping("/delete")
	public String deleteData()
	{
		log.info("data deleted");
		return "MobileController --> deleteData() --> \"/delete\" ";
	}
	

}
