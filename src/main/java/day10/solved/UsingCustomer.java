package day10.solved;

 class UsingCustomExceptions extends Exception {
	
	private static final long serialVersionUID = -8105491977357554060L;

	// Calling each super constructors for each of the types
	public UsingCustomExceptions(String msg) {
		super(msg);
	}

	public UsingCustomExceptions(Throwable te) {
		super(te);
	}

	public UsingCustomExceptions(String msg, Throwable te) {
		super(msg, te);
	}
}


class Task {
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

}

class TaskValidator {
	public static boolean validate(Task task) throws UsingCustomExceptions {
		if (task == null)
			throw new UsingCustomExceptions("Task is null");
		else if (task.getName() == null || "".equals(task.getName()))
			throw new UsingCustomExceptions("Task name is empty");
			return true;
	}
}

public class UsingCustomer {
	public static void main(String[] args) {
		Task task = new Task();
//		task.setName("Creating test case"); Commenting this so that exception is thrown
		
		try {
			TaskValidator.validate(task);
		} catch (UsingCustomExceptions e) {
			e.printStackTrace();
		}
	}
}
