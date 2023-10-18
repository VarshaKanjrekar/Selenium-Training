package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemotestcase {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
        
		// scenario 1 = Valid username & password		
		By textbox = By.name("user-name");
		By textbox1 = By.name("password");
		WebElement textboxElem = driver.findElement(textbox);
		WebElement textboxElem1 = driver.findElement(textbox1);
		//textboxElem.click();
		//textboxElem1.click();
		textboxElem.sendKeys("standard_user");
		textboxElem1.sendKeys("secret_sauce");
		textboxElem.submit();	
		
		//Scenario 2 = Valid username & invalid password		
//		By textbox = By.name("user-name");
//		By textbox1 = By.name("password");
//		WebElement textboxElem = driver.findElement(textbox);
//		WebElement textboxElem1 = driver.findElement(textbox1);
//		textboxElem.sendKeys("standard_user");
//		textboxElem1.sendKeys("secret_sauce11");
//		textboxElem.submit();
		
		// Scenario 3 = Invalid username & valid password 
//		By textbox = By.name("user-name");
//		By textbox1 = By.name("password");
//		WebElement textboxElem = driver.findElement(textbox);
//		WebElement textboxElem1 = driver.findElement(textbox1);
//		textboxElem.sendKeys("standard_user10");
//		textboxElem1.sendKeys("secret_sauce");
//		textboxElem.submit();
		
		// Scenario 4 = Blank username and password
//		By textbox = By.name("user-name");
//		By textbox1 = By.name("password");
//		WebElement textboxElem = driver.findElement(textbox);
//		WebElement textboxElem1 = driver.findElement(textbox1);
//		textboxElem.sendKeys("");
//		textboxElem1.sendKeys("");
//		textboxElem.submit();
		
		// Scenario 5 = Invalid username & password
//		By textbox = By.name("user-name");
//		By textbox1 = By.name("password");
//		WebElement textboxElem = driver.findElement(textbox);
//		WebElement textboxElem1 = driver.findElement(textbox1);
//		textboxElem.sendKeys("standard_user10");
//		textboxElem1.sendKeys("secret_sauce11");
//		textboxElem.submit();
		
		// Scenario 6 = Valid username and blank password
//		By textbox = By.name("user-name");
//		By textbox1 = By.name("password");
//		WebElement textboxElem = driver.findElement(textbox);
//		WebElement textboxElem1 = driver.findElement(textbox1);
//		textboxElem.sendKeys("standard_user");
//		textboxElem1.sendKeys("");
//		textboxElem.submit();
		
		//Scenario 7 = Blank username and Valid password
//		By textbox = By.name("user-name");
//		By textbox1 = By.name("password");
//		WebElement textboxElem = driver.findElement(textbox);
//		WebElement textboxElem1 = driver.findElement(textbox1);
//		textboxElem.sendKeys("");
//		textboxElem1.sendKeys("secret_sauce");
//		textboxElem.submit();
		
}

}
