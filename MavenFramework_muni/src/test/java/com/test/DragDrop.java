package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragDrop {
	@Test

	public void DragDrops() {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver(); //rtp
		//driver.get("https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-GB&.intl=gb&.done=https%3A%2F%2Fmail.yahoo.com%2Fd");
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//Thread.sleep(7000);
		driver.manage().window().maximize(); //Maximize the window
		
		System.out.println(driver.getTitle());
		
		WebElement SP = driver.findElement(By.id("draggable"));
		
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(SP, target).perform();
		
		WebElement dblclickbutton = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		act.doubleClick(dblclickbutton).perform();
		

	}

}
