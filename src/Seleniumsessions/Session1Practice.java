package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session1Practice {

public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\SAGAR\\git\\Selenium-Training\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		By textbox = By.name("q");
		WebElement textboxElem = driver.findElement(textbox);
		textboxElem.click();
		textboxElem.sendKeys("mark zukerburg");
		textboxElem.submit();

		//driver.close();
		//driver.quit();
	}

}
