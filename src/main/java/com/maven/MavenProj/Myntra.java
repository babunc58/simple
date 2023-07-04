package com.maven.MavenProj;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
	WebDriver mynt= new ChromeDriver();
	mynt.get("https://www.myntra.com/");
	mynt.manage().window().maximize();
	
	WebElement women = mynt.findElement(By.xpath("//a[contains(text(),'Women')]"));
	Thread.sleep(5000);
	women.sendKeys(Keys.PAGE_DOWN);
	mynt.getWindowHandles().forEach(tab->mynt.switchTo().window(tab));
	Actions point=new Actions(mynt);
	point.moveToElement(women).perform();
	Thread.sleep(2000);
	mynt.findElement(By.xpath("//li[@data-reactid='193']")).click();
	}

}
