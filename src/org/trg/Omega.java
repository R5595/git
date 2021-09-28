package org.trg;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Omega {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\new selenum\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/odi");
		List<WebElement> list = driver.findElements(By.xpath("//table[@class='table']/tbody/tr/td[2]"));
		List<WebElement> list1 = driver.findElements(By.xpath("//table[@class='table']/tbody/tr/td[3]"));
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getText().equalsIgnoreCase("Scotland")) {
				System.out.println(list1.get(i).getText());
			}
			
			
		}
		

		//driver.manage().window().maximize();
		// WebElement drag = driver.findElement(By.id("email"));
		// WebElement drop = driver.findElement(By.id("pass"));
		// JavascriptExecutor js = (JavascriptExecutor)driver;
		// js.executeScript("arguments[0].setAttribute('value','greens')", drag);
		// String text = (String)js.executeScript("return
		// arguments[0].getAttribute('value')", drag);
		// System.out.println(text);
		// js.executeScript("arguments[0].setAttribute('value','123')", drop);

		// WebElement drag1= driver.findElement(By.xpath("(//a[@class='button
		// button-orange'])[4]"));
		// WebElement drop1 =
		// driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		//
		//
		// Actions a =new Actions(driver);
		// a.dragAndDrop(drag, drop).perform();
		// a.dragAndDrop(drag1, drop1).perform();
		//
		//
		TakesScreenshot tk = (TakesScreenshot)driver;
		 File file = tk.getScreenshotAs(OutputType.FILE);
		// File f = new File("C:\\raju\\dr.png");
		// FileUtils.copyFile(file, f);
		 
		 WebElement select = driver.findElement(By.id("jkbjbu"));
		 Select s = new Select(select);
		 List<WebElement> allSelectedOptions = s.getAllSelectedOptions();  
		
		 
		 
	}
}
