package org.trg;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Trg {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\new selenum\\Selenium\\Driver\\chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/");
	
	WebElement whatapp = driver.findElement(By.xpath("(//img[@title='Greens Technologys Whatsapp'])[1]"));
//	Actions move = new Actions(driver);
//	move.moveToElement(whatapp).perform();
	whatapp.click();
	
	System.out.println(driver.getCurrentUrl());
	
	}

	public void tc() {
		System.out.println("yes");
	}
}
