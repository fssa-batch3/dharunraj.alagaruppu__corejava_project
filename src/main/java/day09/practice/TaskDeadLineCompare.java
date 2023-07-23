package day09.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

// comparable task implements is starts here
public class TaskDeadLineCompare implements Comparable<TaskDeadLineCompare> {
	private int id;
	private String name;
	private LocalDate deadline;

// consturcture starts here
	public TaskDeadLineCompare(int id, String name, LocalDate deadline) {

		this.id = id;
		this.name = name;
		this.deadline = deadline;
	}

	// getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDeadline() {
		return deadline;
	}

	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}

	// over riding tostring method
	@Override
	public String toString() {

		return id + " " + name + " " + deadline;
	}

	// over riding compareto method
	public int compareTo(TaskDeadLineCompare t) {

		if (this.deadline == t.getDeadline()) {
			return 0;
		} else if (this.deadline.compareTo(t.getDeadline()) > 0) {
			return 1;
		} else {
			return -1;
		}

	}



	// method for test case and throw exception
	public static ArrayList<TaskDeadLineCompare> testCaseMethod(ArrayList<TaskDeadLineCompare> arrTask)
			throws IllegalArgumentException {
		if (arrTask == null) {
			throw new IllegalArgumentException("The array cannot be empty");

		}

		Collections.sort(arrTask);
		
		for (TaskDeadLineCompare tasks : arrTask) {
			System.out.println(tasks);

		}
		return arrTask;

	}

	public static void main(String[] args) {
		ArrayList<TaskDeadLineCompare> taskList = new ArrayList<>();

		taskList.add(new TaskDeadLineCompare(1, "Running", LocalDate.of(2012, 01, 10)));

		taskList.add(new TaskDeadLineCompare(2, "Working", LocalDate.of(2011, 01, 10)));

		taskList.add(new TaskDeadLineCompare(3, "Coding", LocalDate.of(2010, 01, 10))) ;

		taskList.add(new TaskDeadLineCompare(4, "Playing", LocalDate.of(2013, 01, 10)));

		taskList.add(new TaskDeadLineCompare(5, "Jacking", LocalDate.of(2014, 01, 10)));

//		ArrayList<Task> arrTask = new ArrayList<>();

//		Collections.sort(taskList);

		testCaseMethod(taskList);

	}
}
