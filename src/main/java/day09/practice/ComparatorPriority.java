package day09.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class ComparatorPriority {

	public static void main(String[] args) {

		Task task1 = new Task(1, "Running", LocalDate.of(2012, 01, 10), 4);

		Task task2 = new Task(2, "Working", LocalDate.of(2011, 01, 10), 5);

		Task task3 = new Task(3, "Coding", LocalDate.of(2010, 01, 10), 6);

		Task task4 = new Task(4, "Playing", LocalDate.of(2013, 01, 10), 7);

		Task task5 = new Task(5, "Jacking", LocalDate.of(2014, 01, 10), 2);

		ArrayList<Task> arrTask = new ArrayList<>();
		arrTask.add(task1);
		arrTask.add(task2);
		arrTask.add(task3);
		arrTask.add(task4);
		arrTask.add(task5);

		Collections.sort(arrTask);

		System.out.println(arrTask.toString());
	}
}

class Task implements Comparable<Task> {
	private int id;
	private String name;
	private LocalDate deadline;
	private int priority;

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public Task(int id, String name, LocalDate deadline, int priority) {

		this.id = id;
		this.name = name;
		this.deadline = deadline;
		this.priority = priority;

	}

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

	@Override
	public String toString() {

		return id + " " + name + " " + deadline + " " + priority;
	}

	@Override
	public int compareTo(Task t) {

		if (this.deadline == t.getDeadline()) {
			if (this.priority == t.getPriority()) {
				return 0;
			} else if (this.priority < (t.getPriority())) {
				return 1;
			} else {
				return -1;
			}
		} else if (this.deadline.compareTo(t.getDeadline()) > 0) {
			return 1;
		} else {
			return -1;
		}

	}

}
