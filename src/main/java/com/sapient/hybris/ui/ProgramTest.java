package com.sapient.hybris.ui;

import com.sapient.hybris.service.Program;

public class ProgramTest {

	public static void main(String[] args) {
		
		Program p = new Program();
		
		System.out.println("Output = "+p.checkString("Welcome"));
		
		System.out.println("Output = "+p.checkString("Hello"));
		
	}

}
