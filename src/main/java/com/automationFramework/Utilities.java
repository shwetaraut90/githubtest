package com.automationFramework;

import org.openqa.selenium.By;

public class Utilities extends DriverFactory {

	
	//launch application
	 public  void lauchApplication(String browser, String appUrl)  
	 {   
	 	getDriver(browser);
		driver.get(appUrl);
	}
	 
	 
	 //close application
	 public void closeApplicaiton() {
		 driver.quit();
	}
	
	 //maximize browser
	 public void maximizeWindow() {
		 driver.manage().window().maximize();
	 }
	 
	 // send text to textField using id
	 public void sendTextToTextField_byId(String elementID, String text) {
		 driver.findElement(By.id(elementID)).sendKeys(text);;
	 }
	 
	 // send text to textField using xpath
	 public void sendTextToTextBox_byXPATH(String elementXPATH, String text) {
		 driver.findElement(By.xpath(elementXPATH)).sendKeys(text);;
	 }
	 
	 
	 //Create method for get title
	 
	 //Create method for clickOnElement using ID
	 
	 //Create method for clickOnElement using XPATH
	 
	 
	
}