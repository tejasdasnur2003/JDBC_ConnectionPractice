package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class ViewController {
	
	@Autowired
	StudRepository studRepository;
	@Autowired
	LeadService leadService;
	
	@RequestMapping("/show")
	public String show()
	{
		return "show";
	}
	
	@RequestMapping("/savedata")
	public String insertData(Leads lead)
	{ 
		leadService.insertData(lead);
		//LeadEmail.LeadEmailsend(lead.getEmail(),"Car Booking","Welcome to Toyota Cars..");
		return "show";
	}
	
	@RequestMapping("/listall")
	public String listalldata(Model model)
	{
		List<Leads> leads=studRepository.findAll();
		model.addAttribute("leads", leads);
		return "listall"; 
	}
	/*
	private LeadRepository leadRepository;
	@RequestMapping("/deletelead")
	public String deleteLeaddata(long id,Model model) throws Exception
	{
		leadServ.deleteonelead(id); 
		List<Leads> leads=leadServ.getAllLeads();
		model.addAttribute("leads",leads);
		
		
		if (!leadRepository.existsById(id)) throw new Exception() ;

		return "listall";
 	}
	
	@RequestMapping("/updatelead")
	public String updateLead(long id, Model model)
	{
		Leads lead=leadServ.updatelead(id);
		model.addAttribute("leads", lead);
		return "updatelead";
	}
*/
}
