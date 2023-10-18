package Seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcasebase {
	static WebDriver driver;

	public static void beforeEverytestcase() {
		Browserutil.setDriver();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
	}
 public static void afterEverytestcase(){
	driver.close();
}
}
