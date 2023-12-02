package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prac {
	
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		WebElement table = driver.findElement(By.id("customers"));
		String text = table.getText();
		System.out.println(text);
		
		//to fetch the header
		List<WebElement> header = table.findElements(By.tagName("th"));
		
		System.out.println("Size of data :"+header.size());
		
		//to get the particular header
		WebElement thirdHeader = header.get(2);
		System.out.println("Third data :"+thirdHeader.getText());
		
		//to get all rows
		for (WebElement x : header) {
			System.out.println(x.getText());
		}
		
		
		
		
	}

}
