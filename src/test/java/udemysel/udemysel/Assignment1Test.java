package udemysel.udemysel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment1Test {
	
	@Test
	public void as1()
	 {	
		
		
		///ruppa biila bunga chunga branch chnge from X 
		System.setProperty("webdriver.chrome.driver", "C://Users//ADMIN//Desktop//Selenium_Udemy//chromedrivers//chromedriver_83.0.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		//////////////////////////1111111111////////////
		WebElement checkbox1=driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]"));
		boolean checkStatus=checkbox1.isSelected();
		System.out.println(checkStatus);
		checkbox1.click();
		boolean checkStatus1=checkbox1.isSelected();
		System.out.println(checkStatus1);
		checkbox1.click();
		boolean checkStatus2=checkbox1.isSelected();
		System.out.println(checkStatus2);
		
		////////////22222222222/////////
		
		List<WebElement> lw=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		
		System.out.println(lw.size());
		driver.quit();
	}

}
