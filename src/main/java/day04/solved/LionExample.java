package day04.solved;

 class AnimalExample2 {
	private int age;
	private String name;
	
	public AnimalExample2(String name) {
		System.out.println("Calling Parent Constructor");
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

public class LionExample extends AnimalExample2 {

	public LionExample(String name) {
		super(name);		// Calling the constructor of Animal class
		System.out.println("Calling Child Constructor");
	}

	private void roar() {
		System.out.println("The " + getAge() + " year old " + getAge() + " says: Roar!");
	}

	public static void main(String[] args) {
		LionExample simba = new LionExample("Simba");
		simba.setAge(10); // setAge() method was not defined in Lion; it is inherited from Animal
		simba.roar();
	}
}