package udemysel.udemysel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicdropdownTest {

	@Test
	public void as7() throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver","C://Users//ADMIN//Desktop//Selenium_Udemy//chromedrivers//chromedriver_83.0.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id=\"glsctl00_mainContent_ddl_originStation1_CTNR\"]//a[@text=\"Bengaluru (BLR)\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"]//a[@text=\"Chennai (MAA)\"]")).click();
		driver.quit();
		

	}

}
