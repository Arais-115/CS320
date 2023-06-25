import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TaskTest 
{
    @Test 
    public void testId() { //Test for correct ID, and if false input
    	Task task = new Task("001", "Reading", "Read Novel Book");
    	    assertAll(
    	        "Task ID test",
    	        ()
    	            -> assertEquals("001", task.getuniqueID()),
    	        ()
    	            -> assertThrows(IllegalArgumentException.class,
    	                            () -> task.updateuniqueID(null)),
    	        ()
    	            -> assertThrows(IllegalArgumentException.class,
    	                            () -> task.updateuniqueID("1234567891011")));
    	    }
    
    @Test 
    public void testName() { //Test for correct Name, and if false input
    	Task task = new Task("001", "Reading", "Read Novel Book");
    	    assertAll(
    	        "Task name test",
    	        ()
    	            -> assertEquals("Reading", task.gettaskName()),
    	        ()
    	            -> assertThrows(IllegalArgumentException.class,
    	                            () -> task.updatetaskName(null)),
    	        ()
    	            -> assertThrows(IllegalArgumentException.class,
    	                            () -> task.updatetaskName("123456789101112131415461718192021222324252627282930")));
    	    }
    @Test 
    public void testDescription() { //Test for correct Description, and if false input
    	Task task = new Task("001", "Reading", "Read Novel Book");
    	    assertAll(
    	        "Task description test",
    	        ()
    	            -> assertEquals("Read Novel Book", task.gettaskDescription()),
    	        ()
    	            -> assertThrows(IllegalArgumentException.class,
    	                            () -> task.updatetaskDescription(null)),
    	        ()
    	            -> assertThrows(IllegalArgumentException.class,
    	                            () -> task.updatetaskDescription("123456789101112131415461718192021222324252627282930")));
    	    }      
}


