package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginmodule {

	public static void login(WebDriver driver, String username, String password){
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		}
public static void validateErrormsg(WebDriver driver,String ExpectedErrormsg) {
	String errortext = driver.findElement(By.className("error-message-container")).getText();
	if(errortext.contains(ExpectedErrormsg)) {
		System.out.println("pass");
	}
	else {
		System.out.println("fail");
	}
}
}
