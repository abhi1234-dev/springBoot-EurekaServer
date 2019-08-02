package com.restapi.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.demo.model.Greet;

@RestController
public class GreetController {

	 private static Map<String, List<Greet>> greetings = new HashMap<String, List<Greet>>();
	 
	    static {
	    	greetings = new HashMap<String, List<Greet>>();
	 
	        List<Greet> lst = new ArrayList<Greet>();
	        Greet gt = new Greet("Hi! Ankur", "Good Morning!!", "How are you doing?");
	        lst.add(gt);
	        gt = new Greet("Hi! Abhi", "Good Morning!!", "Today is Friday.");
	        lst.add(gt);
	 
	        greetings.put("morning", lst);
	 
	        lst = new ArrayList<Greet>();
	        gt = new Greet("Hi! Ravi", "Good Evening!!", "Enjoy the Weekend.");
	        lst.add(gt);
	        gt = new Greet("Hi! Rohit", "Good Evening!!", "Enjoy the Weekend.");
	        lst.add(gt);
	        
	      System.out.println(greetings.get("morning"));	
	 
	        greetings.put("evening", lst);
	 
	    }
	 
	    @GetMapping("/getGreet/{greeting}")
	    public List<Greet> getStudents(@PathVariable String greeting) {
	        System.out.println("Getting Greet details for " + greeting);
	 
	        List<Greet> greetList = greetings.get(greeting);
	        if (greetList == null) {
	        	greetList = new ArrayList<Greet>();
	            Greet greet = new Greet("Not Found", "N/A", greeting);
	            greetList.add(greet);
	        }
	        return greetList;
	    }
	
}
