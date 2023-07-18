package day06.practice;

import java.util.ArrayList;

 class Task {

	    private String name;

	    public Task(String name) {
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }
	}

	public class storeTask {
	    public static void main(String[] args) {
	       
	        ArrayList<Task> tasks = new ArrayList<>();
	        tasks.add(new Task("Study"));
	        tasks.add(new Task("Jacking"));

	        boolean result = findTaskByName("Study", tasks);
	        System.out.println("Tasks  : " + result);
	        
	    }

	    public static  boolean findTaskByName(String name, ArrayList<Task> tasks) {
	        for (Task task : tasks) { // for every object present in the array
	            if (task.getName().equals(name)) {
	                return true;
	            }
	        }
	        return false;
	    }
	}
