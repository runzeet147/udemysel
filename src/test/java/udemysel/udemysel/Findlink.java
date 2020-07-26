package udemysel.udemysel;

import java.util.List;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findlink {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://Users//ADMIN//Desktop//Selenium_Udemy//chromedrivers//chromedriver_83.0.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	
		 List<WebElement> s= driver.findElements(By.tagName("a"));
		 
		 
		 
		 
//		 int count=s.size();		 
		 
		 ListIterator<WebElement> itr=s.listIterator();
		 
		 while(itr.hasNext()) {
			 
			 System.out.println(itr.next().getText());	 

		 }
	}

}
