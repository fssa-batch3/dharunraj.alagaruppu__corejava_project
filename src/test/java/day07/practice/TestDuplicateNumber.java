package day07.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestDuplicateNumber {

	@Test
	public void testValidArray() {

		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(1);

		HashSet<Integer> uniqueArr = new HashSet<Integer>(Arrays.asList(2, 4, 5, 7));
		try {
			DuplicatNumber.removeDuplicateElements(arr);
			boolean valid = DuplicatNumber.validateDuplicatemethod(arr, uniqueArr);
			Assertions.assertTrue(valid);
			Assertions.fail("Validatepriority failed");
		} catch (Exception ex) {
			Assertions.assertEquals("The array does not contain all unique elements.", ex.getMessage());
		}

	}

	@Test
	public void testInValidArray() {

		try {
			DuplicatNumber.removeDuplicateElements(null);
			Assertions.fail("Validatepriority failed");
		} catch (Exception ex) {
			Assertions.assertEquals("Array cannot be null", ex.getMessage());
		}

	}

}
