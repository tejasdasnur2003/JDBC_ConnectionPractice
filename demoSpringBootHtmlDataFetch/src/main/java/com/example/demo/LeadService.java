package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class LeadService {

		@Autowired
		StudRepository studRepository;
		
		public String insertData(@RequestBody Leads lead)
		{	
			String newName=lead.getFname();
			String newGender=lead.getGender();
			
			if(newGender.equalsIgnoreCase("male"))
			{
				newName="Mr"+newName;
				lead.setFname(newName);
			}
			else {
				newName="Mrs"+newName;
				lead.setFname(newName);
			}
			studRepository.save(lead);
			return "Insert Successfully";
		}
}
