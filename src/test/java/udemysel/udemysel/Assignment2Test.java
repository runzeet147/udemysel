package udemysel.udemysel;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Assignment2Test {

	@Test
	public void as2() {

//		DesiredCapabilities dc = new DesiredCapabilities();
//		dc.setBrowserName("chrome");
//		dc.setPlatform(Platform.WIN10);

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.cleartrip.com/");

		Select ad = new Select(driver.findElement(By.id("Adults")));
		ad.selectByVisibleText("2");

		Select ch = new Select(driver.findElement(By.id("Childrens")));
		ch.selectByVisibleText("1");

		driver.findElement(By.id("DepartDate")).click();

		driver.findElement(By.xpath("//a[@class=\"ui-state-default ui-state-highlight ui-state-active \"]")).click();

		driver.findElement(By.id("MoreOptionsLink")).click();

		driver.findElement(By.xpath("//input[@id=\"AirlineAutocomplete\"]")).sendKeys("Indigo");

		driver.findElement(By.xpath("//input[@id=\"SearchBtn\"]")).click();

		System.out.println(driver.findElement(By.xpath("//div[@id=\"homeErrorMessage\"]")).getText());

	}

}
