package Seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxdriversessionpractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\SAGAR\\git\\Selenium-Training\\Drivers\\geckodriver.exe");
		
		WebDriver Driver = new FirefoxDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.google.com");
		
		
		Driver.close();
		//driver.quit();
		
	}

}
