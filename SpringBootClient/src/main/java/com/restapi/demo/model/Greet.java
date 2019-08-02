package com.restapi.demo.model;

public class Greet{
    private String personName;
    private String greetings;
    private String message;
    
    
    
	public Greet(String personName,String greetings,String message) {
		super();
		this.personName = personName;
		this.greetings = greetings;
		this.message = message;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getGreetings() {
		return greetings;
	}
	public void setGreetings(String greetings) {
		this.greetings = greetings;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
     
    
}
