package com.automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	public static WebDriver driver ;
	
	public static WebDriver getDriver(String browser) {
		
		driver = null;
		switch(browser) 
		
		{
		case "chrome": 
						System.setProperty("webdriver.chrome.driver", "C:\\Users\\vedika\\Desktop\\softwares for software testing\\chromedriver.exe");
					    driver = new ChromeDriver();
					    break;	
                 
		case "fireFox": 
			           System.setProperty("webdriver.gecko.driver", "C:\\Users\\vedika\\Desktop\\softwares for software testing\\geckodriver.exe");
		               driver = new FirefoxDriver();
                        break;
		
		}

		return driver;
	}
}