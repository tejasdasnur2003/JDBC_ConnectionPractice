package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping("/msg")
	public void myMsg()
	{
		System.out.println("This is myMsg()");
	}@GetMapping("/name")
	public String myName()
	{
		System.out.println("This is myName()");
		return "Hello!!";
	}@GetMapping("/RollNo")
	public int myRollNo()
	{
		int rollNo=27;
		System.out.println("this is myRollNo()");	
		return rollNo;
	}
	@PostMapping("/insert/{msg}")
	public String insertData(@PathVariable String msg)
	{
		System.out.println("Post method");
		return msg + " Tejas";    //good morning message invoked by msg meathod
	}
	
	@PostMapping("/insert/{manymsg}")
	public String insertData2(@RequestBody String manymsg)
	{
		System.out.println("Post method");
		return manymsg + "Message Printer";    // multiple messages invoked by msg method
	}
	/*@GetMapping("/run")
	public int insertRun(@RequestBody int run)
	{
	public static int run;
	}*/
	public int run=0;
	@GetMapping("/add")
	public int add()
	{
		run=run+1;
		return run;
	}
	
	@GetMapping("/sub")
	public int sub()
	{
		run=run-1;
		return run;
	}

	


}
