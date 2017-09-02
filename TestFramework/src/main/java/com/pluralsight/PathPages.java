package com.pluralsight;

import org.openqa.selenium.By;

public class PathPages {

	static String url = "https://www.pluralsight.com/paths";
	static String title = "Java Programming Learning Path | Pluralsight";
	
	public void goTo() {
		Browser.goTo(url);
	}

	public void goToJavaPath() {
		Browser.driver.findElement(By.xpath("//div[@id='pathContent']/div[59]/a/div/div[2]")).click();
	}

	public boolean isAt() {
		return Browser.title().equals(title);
	}

	
	
}
