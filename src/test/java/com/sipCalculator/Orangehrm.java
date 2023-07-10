package com.sipCalculator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Orangehrm {
	public static String browser="firefox";
	public static WebDriver dr;
	public static void main(String[] args) throws InterruptedException {
		if (browser.equals("firefox")) {
			dr = new FirefoxDriver();
		}else if(browser.equals("chrome")) {
			dr = new ChromeDriver();
		}else if (browser.equals("edge")) {
			dr = new EdgeDriver();
		}
		dr.get("https://www.orangehrm.com");
		dr.findElement(By.xpath("//*[@id=\"Form_submitForm_action_request\"]")).click();
		dr.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a")).click();
		dr.findElement(By.cssSelector(".secondary-menu-3 > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(2)")).click();
		dr.findElement(By.cssSelector(".secondary-menu-3 > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(2) > div:nth-child(1) > div:nth-child(1) > h6:nth-child(2) > a:nth-child(1)")).click();
		
		Thread.sleep(2000);
		
	}

}
