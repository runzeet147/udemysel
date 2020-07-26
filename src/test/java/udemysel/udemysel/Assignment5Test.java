package udemysel.udemysel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment5Test {

	@Test
	public void as5() {


		System.setProperty("webdriver.chrome.driver", "C://Users//ADMIN//Desktop//Selenium_Udemy//chromedrivers//chromedriver_83.0.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		
		driver.findElement(By.xpath("//a [text()=\"Nested Frames\"]")).click();
		
		
		driver.switchTo().frame("frame-top");
		
		driver.switchTo().frame("frame-middle");
		
		System.out.println(driver.findElement(By.id("content")).getText());
		
		
		
		
		
		
		
		driver.quit();

	}

}
