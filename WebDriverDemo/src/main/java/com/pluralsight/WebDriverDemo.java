package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver", "C:/dev/tools/geckodriver.exe");
		
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		WebElement searchField = driver.findElement(By.id("lst-ib"));
		
		searchField.sendKeys("pluralsight");
	}

}
