import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import java.util.Calendar;
import org.junit.jupiter.api.Test;

class AppointmentTest 
{
		Date currentDate = new Date(2024, Calendar.JANUARY, 1);
		
		  @Test
	      public void testappointmentID() 
		  {
	          Appointment appt = new Appointment("001", currentDate,"First Appointment");
	    	    assertAll(
	    	        "ID test",
	    	        ()
	    	            -> assertEquals("001", appt.getAppointmentID()),
	    	        ()
	    	            -> assertThrows(IllegalArgumentException.class,
	    	                            () -> appt.updateAppointmentID(null)),
	    	        ()
	    	            -> assertThrows(IllegalArgumentException.class,
	    	                            () -> appt.updateAppointmentID("1234567891011")));
		  }

	      @Test
	      void testappointmentDate() 
	      {
	    	  Date testDate = new Date();
	    	  testDate.setYear(0);
	    	  Appointment appt = new Appointment("001", currentDate,"First Appointment");
	    	    assertAll(
	    	        "ID test",
	    	        ()
	    	            -> assertEquals(currentDate, appt.getAppointmentDate()),
	    	        ()
	    	            -> assertThrows(IllegalArgumentException.class,
	    	                            () -> appt.updateDate(null)),
	    	        ()
	    	            -> assertThrows(IllegalArgumentException.class,
	    	                            () -> appt.updateDate(testDate)));
		  }

	      @Test
	      void testappointmentDescription() 
	      {
	    	    Appointment appt = new Appointment("001", currentDate,"First Appointment");
	    	    assertAll(
	    	        "ID test",
	    	        ()
	    	            -> assertEquals("First Appointment", appt.getappointmentDescription()),
	    	        ()
	    	            -> assertThrows(IllegalArgumentException.class,
	    	                            () -> appt.updateDescription(null)),
	    	        ()
	    	            -> assertThrows(IllegalArgumentException.class,
	    	                            () -> appt.updateDescription("123456789101112131415461718192021222324252627282930")));
		  }
}



	


