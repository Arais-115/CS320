public class Task {
	// Variables
	private String uniqueID;
	private String taskName;
	private String taskDescription;

	// Constructor
	public Task(String uniqueID, String taskName, String taskDescription) {
		 updateuniqueID(uniqueID);
		 updatetaskName(taskName);
		 updatetaskDescription(taskDescription);
	}

	// Setters
	public void updatetaskDescription(String taskDescription) {
		if (taskDescription == null || taskDescription.length()>50) { 
            throw new IllegalArgumentException("Invalid task name"); 
	  }
	  else 
		this.taskDescription = taskDescription;
	}

	public void updatetaskName(String taskName) {
		if (taskName == null || taskName.length()>20) { 
            throw new IllegalArgumentException("Invalid task name"); 
	  }
	  else 
		this.taskName = taskName;
	}
	
	public void updateuniqueID(String uniqueID) {
		 if (uniqueID == null || uniqueID.length()>10) { 
	            throw new IllegalArgumentException("Invalid ID"); 
		  }
		  else 
			  this.uniqueID = uniqueID;
	}


	// Getters
	public String gettaskDescription() {
		return taskDescription;
	}

	public String getuniqueID() {
		return uniqueID;
	}

	public String gettaskName() 
    {
        return taskName;
    }
}
