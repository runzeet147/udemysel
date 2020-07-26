package udemysel.udemysel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SpicejetTest {

	@Test
	public void as9() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//ADMIN//Desktop//Selenium_Udemy//chromedrivers//chromedriver_83.0.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
//dynamic list 
		driver.findElement(By.xpath("(//input[contains(@id,\"ctl00_mainContent_ddl_originStation1\")])[1]")).click();

		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//div[@id=\"glsctl00_mainContent_ddl_originStation1_CTNR\"]//a[@text=\"Hyderabad (HYD)\"]"))
				.click();
		driver.findElement(By.xpath("//div[@id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"] //a[@value=\"MAA\"]"))
				.click();

		driver.findElement(By.xpath("//div[@id=\"divpaxinfo\"]")).click();
// tradition manner list adding select (tag name select)
		/*
		 * Select s= new
		 * Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		 * s.selectByVisibleText("6");
		 */
		driver.quit();
		}

}