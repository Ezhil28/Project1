package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Work1 {
	public static void main(String[] args) {
		
		//To launch the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\EZHIL ARASAN\\eclipse-workspace\\JavaSelenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//To access the webElement
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("ke.justinjackson@gmail.com");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("9587452135");
		
		WebElement buttonPress = driver.findElement(By.name("login"));
		buttonPress.click();
	}

}