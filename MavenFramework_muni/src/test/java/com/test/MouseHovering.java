package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHovering extends SetUp {

	@Test
	public void Hovering() throws InterruptedException {
		// TODO Auto-generated method stub

		WebElement accountlist = driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"));

		Actions act = new Actions(driver);

		act.moveToElement(accountlist).perform();
		Thread.sleep(2000);

		// driver.findElement(By.xpath("//span[text()='Your Account']")).click();

		List<WebElement> li = driver.findElements(By.xpath("//a[@class='nav-link nav-item']"));

		System.out.println(li.size());
		
		for(int i= 0 ; i<li.size() ; i++)
		{
			System.out.println(li.get(i).getText());
		}
		

	}

}
