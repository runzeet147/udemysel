package udemysel.udemysel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicTableTest {

	@Test
	public void as8(){

		System.setProperty("webdriver.chrome.driver",
				"C://Users//ADMIN//Desktop//Selenium_Udemy//chromedrivers//chromedriver_83.0.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement table = driver.findElement(By.xpath("//table[@id=\"product\"]"));
		int tfess = 0;
		int c = 0;
		int l = 30;
		int rowcount = table.findElements(By.xpath("//table[@id=\"product\"]//tbody//tr")).size();

		for (int i = 2; i <= rowcount; i++) {

			String s = table.findElement(By.xpath("//table[@id=\"product\"]//tbody//tr[" + i + "]//td[3]")).getText();
			int var = Integer.parseInt(s);
			tfess = tfess + var;
			if (c < var) {
				c = var;
			}

			if (l > var) {
				l = var;
			}

		}

		System.out.println(tfess);

		for (int i = 2; i <= rowcount; i++) {

			String s = table.findElement(By.xpath("//table[@id=\"product\"]//tbody//tr[" + i + "]//td[3]")).getText();
			int var = Integer.parseInt(s);

			if (c == var) {

				System.out.println("highest fees course is:-" + table
						.findElement(By.xpath("//table[@id=\"product\"]//tbody//tr[" + i + "]//td[2]")).getText());
			}

			if (l == var) {

				System.out.println("lowest fees course is:-" + table
						.findElement(By.xpath("//table[@id=\"product\"]//tbody//tr[" + i + "]//td[2]")).getText());
			}

		}
		
		
		driver.quit();
	}

}
