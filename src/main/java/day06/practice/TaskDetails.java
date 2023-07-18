package day06.practice;

import java.util.ArrayList;

public class TaskDetails {
	
	    public String name;
	    public int priority;

	    public TaskDetails(String taskName, int priority) {
	        this.name = taskName;
	        this.priority = priority;
	    }

	    public static void main(String[] args) {
	    	
	        ArrayList<TaskDetails> tasks = new ArrayList<>();

	        tasks.add(new TaskDetails("Talk to others", 80));
	       
	        for (TaskDetails i : tasks) {
	            System.out.println(i.name);
	            System.out.println(i.priority);
	            System.out.println();
	        }
	        
	   }
}
