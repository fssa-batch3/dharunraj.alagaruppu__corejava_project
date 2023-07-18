package day05.practice;

public class Student {
	private String name;
	private int id;
	Department department;

	public Student() {

	}

	public Student(String name, int id, Department dept) {
		this.name = name;
		this.id = id;
		this.department = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String toString() {

		return "Student Name = " + name + " , id = " + id;
	}

}
