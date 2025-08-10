package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;

import org.springframework.web.servlet.ModelAndView;

import jakarta.annotation.PostConstruct;

//import ch.qos.logback.core.model.Model;

@Controller
public class UserController {
	@Autowired
	private UserRepository userRepository;
	private UserService userService;
	@RequestMapping("/")    
	public String index()  
	{    
	return"index";    
	}
	@RequestMapping(value="/save", method=RequestMethod.POST)    
	public ModelAndView save(@ModelAttribute UserEntity userEntity)  
	{    
		userRepository.save(userEntity);
		ModelAndView modelAndView = new ModelAndView();    
		modelAndView.setViewName("user-data");        
		modelAndView.addObject("userEntity", userEntity);      
		return modelAndView;    
	}
	
	
	
	 @GetMapping("/users")
	    public String getAllUsers(Model model) {
	        model.addAttribute("users", userService.getAllUsers());
	        return "users"; // users.html in the templates folder
	    }
	 @PostConstruct
	    public void testDataRetrieval() {
	        System.out.println("Users: " + userRepository.findAll());
	    }

	    public List<UserEntity> getAllUsers() {
	        return userRepository.findAll();
	    }
	   /* @GetMapping("/data/{id}")
	    public String getUserById(@PathVariable Long id, Model model) {
	        model.addAttribute("user", userService.getUserById(id));
	        return "userDetails"; // userDetails.html in the templates folder
	    }*/
	
//	@GetMapping("/")
//	public String doPrint()
//	{
//		System.out.println("I am DoPrint");
//		return "Hello Spring Security<a href=http://localhost:8082/test>Click Here</a>";
//	}
//	@GetMapping("/test")
//	public String test()
//	{
//		return "Connected<a href=http://localhost:8082/logout>logout</a>";
//	}

	/*@GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id, Model model) {
        userRepository.deleteById(id);
        model.addAttribute("message", "User deleted successfully");
        
        return "redirect:/users";
    }*/
	
	

}
