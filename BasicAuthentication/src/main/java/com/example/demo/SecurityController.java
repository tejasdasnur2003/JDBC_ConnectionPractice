package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
@GetMapping("/test")
public String test()
{
	return "Connected<a href=http://localhost:8082/logout>logout</a>";
}
@GetMapping("/")
public String doPrint()
{
	System.out.println("I am DoPrint");
	return "Hello Spring Security<a href=http://localhost:8082/test>Click Here</a>";
}


}
