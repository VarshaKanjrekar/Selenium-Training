package Seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edgedriversessionpractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\SAGAR\\git\\Selenium-Training\\Drivers\\msedgedriver.exe");
		
		WebDriver Driver = new EdgeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.google.com");
		
		Driver.close();
		//driver.quit();
		

	}

}
