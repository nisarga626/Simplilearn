package emailValidation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	public static boolean isValidEmail(String email) {
		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();

	}

	public static void main(String[] args) {
		List<String> emails = new ArrayList<String>();
		// valid email
		emails.add("nisarga@626.com");
		emails.add("nisarga@26.com");
		emails.add("nisarga@6.me.org");
		// invalid email
		emails.add("bro.hlc.com");
		emails.add("prubs..ns#hlc.com");
		emails.add("@.hlc.com");
		for (String value : emails) {
			System.out.println("The Email address " + value + " is " + (isValidEmail(value) ? "valid" : "invalid"));
		}

		System.out.println("Enter any email address to check");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));

	}


}
