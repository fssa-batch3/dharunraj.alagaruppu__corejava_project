package day10.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestInvalidExcection {

	@Test
	public void testValidEmail() {
		String email = "dharun@gmail.com";
		try {
			boolean vaild = EmailValidator.isValidEmail(email);
			Assertions.assertTrue(vaild);
		} catch (InvalidEmailException e) {
			Assertions.fail("Valid email should not throw an exception");
		}

	}

	@Test
	public void testInValidEmail() {

		String email = "dharunrajalagaruppugamilcom";
		try {
			boolean vaild = EmailValidator.isValidEmail(email);
			Assertions.assertTrue(vaild);
		} catch (InvalidEmailException e) {
			Assertions.assertEquals("Invalid", e.getMessage());
		}

		try {
			boolean vaild = EmailValidator.isValidEmail(null);
			Assertions.assertTrue(vaild);
		} catch (InvalidEmailException e) {
			Assertions.assertEquals("The email cannot be null", e.getMessage());
		}

	}
}
