package day09.practice;

//package day09.practice;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import day07.practice.DuplicateTask;

public class TestTaskDeadLine {

	@Test

	public void testValidarray1() {

		// taskList.add(new SortingTask(1, "taseat", LocalDate.of(2023, 7, 19)));

		ArrayList<TaskDeadLineCompare> arrTask2 = new ArrayList<>();

		arrTask2.add(new TaskDeadLineCompare(1, "Running", LocalDate.of(2012, 01, 10)));

		arrTask2.add(new TaskDeadLineCompare(2, "Working", LocalDate.of(2011, 01, 10)));

		arrTask2.add(new TaskDeadLineCompare(3, "Coding", LocalDate.of(2010, 01, 10)));

		arrTask2.add(new TaskDeadLineCompare(4, "Playing", LocalDate.of(2013, 01, 10)));

		arrTask2.add(new TaskDeadLineCompare(5, "Jacking", LocalDate.of(2014, 01, 10)));

		ArrayList<TaskDeadLineCompare> arrTask3 = new ArrayList<>();
		arrTask3.add(new TaskDeadLineCompare(5, "Jacking", LocalDate.of(2014, 01, 10)));
		arrTask3.add(new TaskDeadLineCompare(1, "Running", LocalDate.of(2012, 01, 10)));

		arrTask3.add(new TaskDeadLineCompare(2, "Working", LocalDate.of(2011, 01, 10)));

		arrTask3.add(new TaskDeadLineCompare(3, "Coding", LocalDate.of(2010, 01, 10)));

		arrTask3.add(new TaskDeadLineCompare(4, "Playing", LocalDate.of(2013, 01, 10)));

		ArrayList<TaskDeadLineCompare> actualUniqueList1 = TaskDeadLineCompare.testCaseMethod(arrTask2);

		Assertions.assertIterableEquals(actualUniqueList1, arrTask3);
//		Assertions.assertIterableEquals(TaskDeadLineCompare.testCaseMethod(arrTask2),TaskDeadLineCompare.testCaseMethod(arrTask3));
//		Assertions.assertTrue(TaskDeadLineCompare.testCaseMethod(arrTask2));

	}

	@Test

	public void testInValid() {

		try {

			TaskDeadLineCompare.testCaseMethod(null);
			Assertions.fail("testInValidarray failed");
		} catch (IllegalArgumentException ex) {

			Assertions.assertEquals("The array cannot be empty", ex.getMessage());

		}

	}

}
