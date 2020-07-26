apackage udemysel.udemysel;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment4Test {

	@Test
	public void as4() {


		System.setProperty("webdriver.chrome.driver", "C://Users//ADMIN//Desktop//Selenium_Udemy//chromedrivers//chromedriver_83.0.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Multiple Windows")).click();
		
		driver.findElement(By.linkText("Click Here")).click();
		
		
		Set<String> wh=driver.getWindowHandles();
		Iterator<String> it=  wh.iterator();
		String parentid=it.next();
		String childid=it.next();
		
		driver.switchTo().window(childid);
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentid);
		
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		
		
		driver.quit();
		
		
		

	}

}
