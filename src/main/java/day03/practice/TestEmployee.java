package day03.practice;

public class TestEmployee {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "naresh");
		Employee e2 = new Employee(2, "suresh");
		
		System.out.print("id = " + e1.getId());
		System.out.print("," + "\t");
		System.out.println("name = " + e1.getName());
		
		System.out.println();
		
		System.out.print("id = " + e2.getId());
		System.out.print("," + "\t");
		System.out.println("name = " + e2.getName());
		
	}

}

class Employee {

	private int id;
	private String name;

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

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
}


