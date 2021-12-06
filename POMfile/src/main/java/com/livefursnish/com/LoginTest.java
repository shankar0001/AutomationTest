package com.livefursnish.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/gagan/Downloads/chromedriver-1");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://migration.livefurnish.com/users/admin_login/");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("suraj");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("imagesUnity@12369");
		driver.findElement(By.xpath("//button[@id=\"login\"]")).click();
		driver.findElement(By.xpath("//a[text()='User Accounts']")).click();

	}

}
