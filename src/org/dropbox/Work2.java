package org.dropbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Work2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\EZHIL ARASAN\\eclipse-workspace\\JavaSelenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.dropbox.com/login");
		
		WebElement userName = driver.findElement(By.name("login_email"));
		userName.sendKeys("karthickkane2@gmail.com");
		
		WebElement password = driver.findElement(By.name("login_password"));
		password.sendKeys("12345@abc");
		
		WebElement buttonClick = driver.findElement(By.name("signin-button"));
		buttonClick.click();
	}


}
