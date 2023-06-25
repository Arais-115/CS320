import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class TaskServiceTest 
{
	@Test //Test for all three String updates
	public void testCompleteUpdate() 
	{
		TaskService ts = new TaskService();
		Task t1 = new Task("001", "Cleaning Service", "Cleaning service has been performed");
		Task t2 = new Task("002", "Removing documents", "Document cleanup has been performed");
		assertEquals(true, ts.addTask(t1));
		assertEquals(true, ts.addTask(t2));
	}
	
	@Test //Test for single Name String update
	public void testSingleNameUpdate() 
	{
		TaskService ts = new TaskService();
		Task t1 = new Task("001", "Cleaning Service", "Cleaning service has been performed");
		Task t2 = new Task("002", "Removing documents", "Document cleanup has been performed");
		ts.addTask(t1);
		ts.addTask(t2);
		assertEquals(true, ts.updateTaskName("001", "Dirt Removal"));
		assertEquals(true, ts.updateTaskName("002", "Documents Updated"));
	}
	
	@Test //Test for single Description String update
	public void testSingleDescriptionUpdate() 
	{

		TaskService ts = new TaskService();
		Task t1 = new Task("001", "Cleaning Service", "Cleaning service has been performed");
		Task t2 = new Task("002", "Removing documents", "Document cleanup has been performed");
		ts.addTask(t1);
		ts.addTask(t2);
		assertEquals(true, ts.updateTaskDescription("001", "Document cleanup has been performed"));
		assertEquals(true, ts.updateTaskDescription("002", "Schedule has been adjusted"));
		
	}

	@Test
	public void testAddFail() 
	{
		TaskService ts = new TaskService();
		Task t1 = new Task("002", "Cleaning Service", "Cleaning service has been performed");
		Task t2 = new Task("003", "Removing documents", "Document cleanup has been performed");
		Task t3 = new Task("003", "Adjusting Schedule", "Schedule has been adjusted");
		
		assertEquals(true, ts.addTask(t1));
		assertEquals(true, ts.addTask(t2));
		assertEquals(true, ts.addTask(t3));
		assertEquals(false, ts.addTask(t1));
	}

	@Test
	public void testDeletePass() 
	{
		TaskService ts = new TaskService();
		Task t1 = new Task("002", "Cleaning Service", "Cleaning service has been performed");
		Task t2 = new Task("003", "Removing documents", "Document cleanup has been performed");
		Task t3 = new Task("003", "Adjusting Schedule", "Schedule has been adjusted");
	
		assertEquals(true, ts.addTask(t1));
		assertEquals(true, ts.addTask(t2));
		assertEquals(true, ts.addTask(t3));
		assertEquals(true, ts.deleteTask("002"));
		assertEquals(true, ts.deleteTask("003"));
		
	}
	
	@Test
	public void testDeleteFail() 
	{
		TaskService ts = new TaskService();
		Task t1 = new Task("002", "Cleaning Service", "Cleaning service has been performed");
		Task t2 = new Task("003", "Removing documents", "Document cleanup has been performed");
		Task t3 = new Task("003", "Adjusting Schedule", "Schedule has been adjusted");
	
		assertEquals(true, ts.addTask(t1));
		assertEquals(true, ts.addTask(t2));
		assertEquals(true, ts.addTask(t3));
		
		assertEquals(true, ts.deleteTask("002"));
		assertEquals(false, ts.deleteTask("004"));
	}


	@Test
	public void testUpdatePass() 
	{
		TaskService ts = new TaskService();
		Task t1 = new Task("002", "Cleaning Service", "Cleaning service has been performed");
		Task t2 = new Task("003", "Removing documents", "Document cleanup has been performed");
		Task t3 = new Task("003", "Adjusting Schedule", "Schedule has been adjusted");
		
		assertEquals(true, ts.addTask(t1));
		assertEquals(true, ts.addTask(t2));
		assertEquals(true, ts.addTask(t3));
		
		assertEquals(true, ts.updateTask("002", "Adjusting Schedule", "Schedule has been adjusted"));
		assertEquals(true, ts.updateTask("003", "Removing documents", "Document cleanup has been performed"));
	
	}
	
	@Test
	public void testUpdateFail() 
	{

		TaskService ts = new TaskService();
		Task t1 = new Task("002", "Cleaning Service", "Cleaning service has been performed");
		Task t2 = new Task("003", "Removing documents", "Document cleanup has been performed");
		Task t3 = new Task("003", "Adjusting Schedule", "Schedule has been adjusted");
		
		assertEquals(true, ts.addTask(t1));
		assertEquals(true, ts.addTask(t2));
		assertEquals(true, ts.addTask(t3));
		
		assertEquals(true, ts.updateTask("002", "Power Restored", "Power station completed maintenance"));
		assertEquals(true, ts.updateTask("003", "Building Updated", ""));
		
	}
		
}



