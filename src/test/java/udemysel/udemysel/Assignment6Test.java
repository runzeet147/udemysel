package udemysel.udemysel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class Assignment6Test {

	@Test
	public void as6(){
		
		System.setProperty("webdriver.chrome.driver", "C://Users//ADMIN//Desktop//Selenium_Udemy//chromedrivers//chromedriver_83.0.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption2")).click();
		
		String r=driver.findElement(By.xpath("//input[@id=\"checkBoxOption2\"]/parent::label")).getText();
		
		Select s=new Select(driver.findElement(By.xpath("//select[@id=\"dropdown-class-example\"]")));
		
		s.selectByVisibleText(r);
		
		driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys(r);
		
		driver.findElement(By.xpath("//input[@id=\"alertbtn\"]")).click();
		
		String a= driver.switchTo().alert().getText();
		
		System.out.println(a.contains(r));
		
		
		
		
		
		
		
		driver.quit();
		
		

	}

}
