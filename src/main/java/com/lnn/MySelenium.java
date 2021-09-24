package com.lnn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MySelenium {

	public static void main(String[] args) {
		String projectLocation = System.getProperty("user.dir");
		//System.out.println(projectLocation);
		
		System.setProperty("webdriver.gecko.driver", projectLocation + "\\src\\main\\resources\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver=new MarionetteDriver();
		driver.get("http://youtube.com/");
		driver.quit();

	}

}
