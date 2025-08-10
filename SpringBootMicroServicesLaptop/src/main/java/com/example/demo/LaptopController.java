package com.example.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
public class LaptopController {
	@GetMapping("/get")
	public String retriveData()
	{
		log.info("Data Recieved");
		return "LaptopController --> retriveData() -->\"/get\" ";
	}
	@PostMapping("/insert")
	public String insertData()
	{
		log.info("data inserted");
		return "LaptopController --> insertData() --> \"/insert\" ";
	}
	@PutMapping("/update")
	public String updateData()
	{
		log.info("data updated");
		return "LaptopController --> updateData() --> \"/update\" ";
	}
	@DeleteMapping("/delete")
	public String deleteData()
	{
		log.info("data deleted");
		return "LaptopController --> deleteData() --> \"/delete\" ";
	}
	/*@PostMapping("/laptopentity")
	public String insertDataEntity()
	{
		log.info("Laptop Entity Inserted");
		return "LaptopEntity --> insertedData() -->\"/inserted\" ";
	}
	*/

}
