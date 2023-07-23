package day10.practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class InvalidEmailException extends Exception {

	private static final long serialVersionUID = -8105491977357554060L;

	public InvalidEmailException(String msg) {
		super(msg);
	}

	public InvalidEmailException(Throwable te) {
		super(te);
	}

	public InvalidEmailException(String msg, Throwable te) {
		super(msg, te);
	}
}

class EmailValidator {
	public static boolean isValidEmail(String email) throws InvalidEmailException {

		if (email == null) {
			throw new InvalidEmailException("The email cannot be null");
		}

		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		Boolean isMatch = Pattern.matches(regex, email);

		if (!isMatch) {
			throw new InvalidEmailException("Invalid");
		}

		return true;

	}
}

public class EmailExceptionDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your emailId : ");

		String email = sc.nextLine();

		sc.close();

		try {

			EmailValidator.isValidEmail(email);
			System.out.println("Valid");
		} catch (InvalidEmailException e) {
			e.printStackTrace();
		}

	}

}
