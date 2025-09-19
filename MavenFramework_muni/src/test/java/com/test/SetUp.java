package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class SetUp {
	
	WebDriver driver;

	@BeforeClass
	public void Initalization() throws InterruptedException {
		driver = new ChromeDriver(); // rtp
		// driver.get("https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-GB&.intl=gb&.done=https%3A%2F%2Fmail.yahoo.com%2Fd");
		driver.get("https://www.amazon.in");

		Thread.sleep(7000);
		driver.manage().window().maximize(); // Maximize the window

		System.out.println(driver.getTitle());
	}
	
	@AfterClass
	public void CleanUp() {
		driver.quit();
	}


}
