package com.demoqa.tests;
import org.testng.annotations.Test;

import com.automationFramework.Utilities;

public class TestApplication {
	
	
	Utilities util = new Utilities();
	
	@Test
	public void validateLaunchApplication() throws InterruptedException {
		
		util.lauchApplication("chrome", "https://demoqa.com/");
		
		Thread.sleep(10000);
		
		System.out.println("Application launch successfullly");
		
		util.maximizeWindow();
		
		util.closeApplicaiton();

	}
	
	
	@Test
	public void validateForm() {
		
		//launch appp
		
		//click on forms
		
		//click on practice form
		
		//Fill Student Registration Form
	}
}