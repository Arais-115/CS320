import java.util.ArrayList;

public class TaskService {
	private ArrayList<Task> tasks;

	// Constructor
	public TaskService() 
	{
		tasks = new ArrayList<>();
	}

	public boolean addTask(Task task) 
	{
		boolean existing = false;
		//Check for existing Task
		for (Task ts : tasks) {
			if (ts.equals(task)) {
				existing = true;
			}
		}
		
		//Add if non-existing
		if (!existing) 
		{
			tasks.add(task);
			System.out.println("Task added.");
			return true;
		}
		else
		{
			System.out.println("Task already exists.");
			return false;
		}

	}

	// Delete task method 
	public boolean deleteTask(String uniqueID) {
		for (Task ts : tasks) 
		{
			if (ts.getuniqueID().equals(uniqueID))
			{
				tasks.remove(ts);
				System.out.println("Task removed.");
				return true;
			}
		}
		System.out.println("Task not present.");
		return false;
	}

	// Update task method 
	public boolean updateTask(String uniqueID, String taskName, String taskDescription) 
	{
		for (Task ts : tasks) 
		{
			if (ts.getuniqueID().equals(uniqueID)) 
			{
				if (!taskName.equals(""))
					ts.updatetaskName(taskName);
				if (!taskDescription.equals(""))
					ts.updatetaskDescription(taskDescription);		
				return true;
			}
		}
		return false;
	}
	
	public boolean updateTaskName(String uniqueID, String taskName) 
	{
		for (Task ts : tasks) 
		{
			if (ts.getuniqueID().equals(uniqueID)) 
			{
				if (!taskName.equals(""))
					ts.updatetaskName(taskName);			
				return true;
			}
		}
		return false;
	}
	
	public boolean updateTaskDescription(String uniqueID, String taskDescription) 
	{
		for (Task ts : tasks) 
		{
			if (ts.getuniqueID().equals(uniqueID)) 
			{
				if (!taskDescription.equals(""))
					ts.updatetaskDescription(taskDescription);
				return true;
			}
		}
		return false;
	}
}


