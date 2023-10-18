package Seleniumsessions;

public class NegativeTestcases extends Testcasebase {

	public static void verify_password_is_required_when_user_enter_no_password(){
		beforeEverytestcase();
		Loginmodule.login(driver, "Standard_user", "");
		Loginmodule.validateErrormsg(driver, "Password is required");
		afterEverytestcase();
	}
	public static void verify_password_is_required_when_user_enter_no_username(){
		beforeEverytestcase();
		Loginmodule.login(driver, "", "secret_sauce");
		Loginmodule.validateErrormsg(driver, "Username is required");
		afterEverytestcase();
	}
	public static void verify_password_is_required_when_user_enter_no_username_and_password(){
		beforeEverytestcase();
		Loginmodule.login(driver, "", "");
		Loginmodule.validateErrormsg(driver, "Username is required");
		afterEverytestcase();
	}

}
