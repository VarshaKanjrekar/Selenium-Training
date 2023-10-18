package Seleniumsessions;

public class TestcaseExecutor {

	public static void main(String[] args) {
		NegativeTestcases.verify_password_is_required_when_user_enter_no_password();
		NegativeTestcases.verify_password_is_required_when_user_enter_no_username();
		NegativeTestcases.verify_password_is_required_when_user_enter_no_username_and_password();

	}

}
