package com.sapient.hybris.service;

public class Program {
	
	
	public String checkString(String str) {
		if(str.length() == 0)
			return "Enter some String";
		if(str.equals("Welcome")) {
			return "Thank You";
		}
		
			return "Try Again";
	}
	
	
}
