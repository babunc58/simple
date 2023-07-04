package com.maven.MavenProj;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazontry {
	public static void main(String[] args) {
	
		WebDriver amaz=new ChromeDriver();
		amaz.get("https://www.amazon.in");
		amaz.manage().window().maximize();
		WebElement element = amaz.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		element.click();
		element.clear();
		element.sendKeys("puma shoe",Keys.ENTER);
		amaz.findElement(By.xpath("(//a[@target='_blank'])[6]")).click();
		amaz.getWindowHandles().forEach(tab->amaz.switchTo().window(tab));
		WebElement m=amaz.findElement(By.xpath("//select[@id='quantity']"));
		Select a=new Select(m);
		a.selectByValue("3");
		amaz.get("https://www.flipkart.com");
		String currentUrl = amaz.getCurrentUrl();
		System.out.println(currentUrl);
		
	
	}
	
}
